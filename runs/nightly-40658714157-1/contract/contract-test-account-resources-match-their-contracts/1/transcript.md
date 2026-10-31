# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 417 | `qa-5b82d79a-8bfb-4fcf-8913-8fdc5dc653fb` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-897b1a55-f5b9-48fa-a3c3-96bf6a1545c7` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-17564e1f-5393-4ba4-90af-b1258f18bf9a` |
| 4 | `POST /v1/auth/token` | 200 | 54 | `qa-e2a12f64-67fa-4211-829a-673a567d1922` |
| 5 | `GET /v1/accounts/me` | 200 | 28 | `qa-e3649408-65f1-45dd-9ba5-9c85cb67496a` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 40 | `qa-97f6804c-36db-432f-8076-92e3316eb2e0` |
| 7 | `POST /v1/auth/token` | 200 | 12 | `qa-149b94f0-40d3-4d82-9432-fcfea6fe0381` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-706b7674-bcd5-4e29-8756-98b1d25a609e` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-aaf774d7-e714-4209-a839-6ac4d019ab19` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c7ef2688-54a6-40cc-9838-8888359eaacc` |
| 11 | `POST /v1/auth/token` | 401 | 23 | `qa-a3cf0e21-8185-494d-98ac-d81faf68aa72` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b82d79a-8bfb-4fcf-8913-8fdc5dc653fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b82d79a-8bfb-4fcf-8913-8fdc5dc653fb
Content-Type: application/json

--- request body ---
{"handle":"qa-3f1201bbdcf8","displayName":"QA 3f1201bbdcf8","password":"****","region":"eu"}

--- response: 201 in 417 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b82d79a-8bfb-4fcf-8913-8fdc5dc653fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-3f1201bbdcf8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_338a609c-a47e-457b-8c9e-50edfc8ff95c","handle":"qa-3f1201bbdcf8","displayName":"QA 3f1201bbdcf8","region":"eu","role":"user","createdAt":"2026-10-28T08:43:03.559162432Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-897b1a55-f5b9-48fa-a3c3-96bf6a1545c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-897b1a55-f5b9-48fa-a3c3-96bf6a1545c7
Content-Type: application/json

--- request body ---
{"handle":"qa-5393a0f058fc","displayName":"QA 5393a0f058fc","password":"****","region":"us"}

--- response: 201 in 58 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-897b1a55-f5b9-48fa-a3c3-96bf6a1545c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-5393a0f058fc
X-Served-Region: us
Content-Length: 181

{"id":"acc_1dceb7c2-2386-470b-8f50-a2678c1fa869","handle":"qa-5393a0f058fc","displayName":"QA 5393a0f058fc","region":"us","role":"user","createdAt":"2026-10-28T08:43:04.035396405Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17564e1f-5393-4ba4-90af-b1258f18bf9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17564e1f-5393-4ba4-90af-b1258f18bf9a
Content-Type: application/json

--- request body ---
{"handle":"qa-3f1201bbdcf8","password":"****"}

--- response: 200 in 43 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-17564e1f-5393-4ba4-90af-b1258f18bf9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_338a609c-a47e-457b-8c9e-50edfc8ff95c"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e2a12f64-67fa-4211-829a-673a567d1922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a12f64-67fa-4211-829a-673a567d1922
Content-Type: application/json

--- request body ---
{"handle":"qa-3f1201bbdcf8","password":"****"}

--- response: 200 in 54 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2a12f64-67fa-4211-829a-673a567d1922
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_338a609c-a47e-457b-8c9e-50edfc8ff95c"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3649408-65f1-45dd-9ba5-9c85cb67496a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3649408-65f1-45dd-9ba5-9c85cb67496a
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3649408-65f1-45dd-9ba5-9c85cb67496a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_338a609c-a47e-457b-8c9e-50edfc8ff95c","handle":"qa-3f1201bbdcf8","displayName":"QA 3f1201bbdcf8","region":"eu","role":"user","createdAt":"2026-10-28T08:43:03.559162432Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-5393a0f058fc
correlation: qa-97f6804c-36db-432f-8076-92e3316eb2e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97f6804c-36db-432f-8076-92e3316eb2e0
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-97f6804c-36db-432f-8076-92e3316eb2e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-5393a0f058fc","displayName":"QA 5393a0f058fc","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-149b94f0-40d3-4d82-9432-fcfea6fe0381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-149b94f0-40d3-4d82-9432-fcfea6fe0381
Content-Type: application/json

--- request body ---
{"handle":"qa-5393a0f058fc","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-149b94f0-40d3-4d82-9432-fcfea6fe0381
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1dceb7c2-2386-470b-8f50-a2678c1fa869"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-706b7674-bcd5-4e29-8756-98b1d25a609e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-706b7674-bcd5-4e29-8756-98b1d25a609e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-706b7674-bcd5-4e29-8756-98b1d25a609e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-aaf774d7-e714-4209-a839-6ac4d019ab19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaf774d7-e714-4209-a839-6ac4d019ab19
Content-Type: application/json

--- request body ---
{"handle":"qa-5393a0f058fc","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aaf774d7-e714-4209-a839-6ac4d019ab19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aaf774d7-e714-4209-a839-6ac4d019ab19"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7ef2688-54a6-40cc-9838-8888359eaacc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7ef2688-54a6-40cc-9838-8888359eaacc
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7ef2688-54a6-40cc-9838-8888359eaacc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-a3cf0e21-8185-494d-98ac-d81faf68aa72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3cf0e21-8185-494d-98ac-d81faf68aa72
Content-Type: application/json

--- request body ---
{"handle":"qa-3f1201bbdcf8","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3cf0e21-8185-494d-98ac-d81faf68aa72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a3cf0e21-8185-494d-98ac-d81faf68aa72"}
```
