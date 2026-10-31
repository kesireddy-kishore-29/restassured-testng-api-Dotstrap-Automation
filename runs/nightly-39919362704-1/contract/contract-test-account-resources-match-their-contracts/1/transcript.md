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
| 1 | `POST /v1/accounts` | 201 | 448 | `qa-d67d2fd5-cfe8-4bc6-a66f-d5a0d9cb4dd5` |
| 2 | `POST /v1/accounts` | 201 | 120 | `qa-cba47527-735d-4b30-bb75-5d8e860a0b22` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-7289c674-b025-4d87-b9b4-51b2d18e8c5e` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-dd8e7472-a7f2-4b6f-9c89-5f9e7d0482f2` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-438638ad-d80a-46f9-b70d-fe04da11c237` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 55 | `qa-eb0739ee-cdde-4992-8945-b38a15170114` |
| 7 | `POST /v1/auth/token` | 200 | 31 | `qa-3615ae0f-896b-4b1a-b10d-3db4afefe349` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-70e5310b-c77e-4d0b-9220-b2c42a346469` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-6d780838-ea6b-4e9d-91a3-94a247378a6e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-17ce8a72-28be-4dac-b0de-5e25aa2b9d9f` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-f8805443-55c0-4266-9e4a-7fb065dd29b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d67d2fd5-cfe8-4bc6-a66f-d5a0d9cb4dd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d67d2fd5-cfe8-4bc6-a66f-d5a0d9cb4dd5
Content-Type: application/json

--- request body ---
{"handle":"qa-ef9c276873f1","displayName":"QA ef9c276873f1","password":"****","region":"eu"}

--- response: 201 in 448 ms ---
Date: Fri, 23 Oct 2026 07:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d67d2fd5-cfe8-4bc6-a66f-d5a0d9cb4dd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-ef9c276873f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87b6bcdc-436f-43a3-b8a8-49ca3636b67d","handle":"qa-ef9c276873f1","displayName":"QA ef9c276873f1","region":"eu","role":"user","createdAt":"2026-10-23T07:42:05.939916940Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cba47527-735d-4b30-bb75-5d8e860a0b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cba47527-735d-4b30-bb75-5d8e860a0b22
Content-Type: application/json

--- request body ---
{"handle":"qa-19e9b7b45535","displayName":"QA 19e9b7b45535","password":"****","region":"us"}

--- response: 201 in 120 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-cba47527-735d-4b30-bb75-5d8e860a0b22
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
Location: /v1/accounts/qa-19e9b7b45535
X-Served-Region: us
Content-Length: 181

{"id":"acc_2f34dffb-3958-43a7-99a3-5b90bc786a21","handle":"qa-19e9b7b45535","displayName":"QA 19e9b7b45535","region":"us","role":"user","createdAt":"2026-10-23T07:42:06.391388585Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7289c674-b025-4d87-b9b4-51b2d18e8c5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7289c674-b025-4d87-b9b4-51b2d18e8c5e
Content-Type: application/json

--- request body ---
{"handle":"qa-ef9c276873f1","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7289c674-b025-4d87-b9b4-51b2d18e8c5e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87b6bcdc-436f-43a3-b8a8-49ca3636b67d"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-dd8e7472-a7f2-4b6f-9c89-5f9e7d0482f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd8e7472-a7f2-4b6f-9c89-5f9e7d0482f2
Content-Type: application/json

--- request body ---
{"handle":"qa-ef9c276873f1","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd8e7472-a7f2-4b6f-9c89-5f9e7d0482f2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87b6bcdc-436f-43a3-b8a8-49ca3636b67d"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-438638ad-d80a-46f9-b70d-fe04da11c237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-438638ad-d80a-46f9-b70d-fe04da11c237
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-438638ad-d80a-46f9-b70d-fe04da11c237
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

{"id":"acc_87b6bcdc-436f-43a3-b8a8-49ca3636b67d","handle":"qa-ef9c276873f1","displayName":"QA ef9c276873f1","region":"eu","role":"user","createdAt":"2026-10-23T07:42:05.939916940Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-19e9b7b45535
correlation: qa-eb0739ee-cdde-4992-8945-b38a15170114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb0739ee-cdde-4992-8945-b38a15170114
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb0739ee-cdde-4992-8945-b38a15170114
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

{"handle":"qa-19e9b7b45535","displayName":"QA 19e9b7b45535","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-3615ae0f-896b-4b1a-b10d-3db4afefe349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3615ae0f-896b-4b1a-b10d-3db4afefe349
Content-Type: application/json

--- request body ---
{"handle":"qa-19e9b7b45535","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3615ae0f-896b-4b1a-b10d-3db4afefe349
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f34dffb-3958-43a7-99a3-5b90bc786a21"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70e5310b-c77e-4d0b-9220-b2c42a346469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70e5310b-c77e-4d0b-9220-b2c42a346469
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70e5310b-c77e-4d0b-9220-b2c42a346469
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
correlation: qa-6d780838-ea6b-4e9d-91a3-94a247378a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d780838-ea6b-4e9d-91a3-94a247378a6e
Content-Type: application/json

--- request body ---
{"handle":"qa-19e9b7b45535","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d780838-ea6b-4e9d-91a3-94a247378a6e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d780838-ea6b-4e9d-91a3-94a247378a6e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17ce8a72-28be-4dac-b0de-5e25aa2b9d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ce8a72-28be-4dac-b0de-5e25aa2b9d9f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17ce8a72-28be-4dac-b0de-5e25aa2b9d9f
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
correlation: qa-f8805443-55c0-4266-9e4a-7fb065dd29b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8805443-55c0-4266-9e4a-7fb065dd29b2
Content-Type: application/json

--- request body ---
{"handle":"qa-ef9c276873f1","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8805443-55c0-4266-9e4a-7fb065dd29b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8805443-55c0-4266-9e4a-7fb065dd29b2"}
```
