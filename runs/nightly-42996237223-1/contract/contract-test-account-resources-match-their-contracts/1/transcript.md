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
| 1 | `POST /v1/accounts` | 201 | 338 | `qa-5ae06815-2d91-4f28-a9c2-e4d13b09b23e` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-c8b8d272-9bbe-4a91-809e-fd599e68c5cc` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-d508cae4-032c-4f39-aca5-c1dcbb53fb8b` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-08991880-0fd3-42ab-9642-3e9a891fd351` |
| 5 | `GET /v1/accounts/me` | 200 | 40 | `qa-2fb32033-0e3d-4b36-90d7-fd7ac54319bc` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 25 | `qa-27fe4d6d-a8bd-4fee-81f7-3d9bb64cf763` |
| 7 | `POST /v1/auth/token` | 200 | 13 | `qa-ef508f70-174a-4b39-89d6-d0d13593e22e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-bf1e099c-8dd5-45ea-a1ed-2061d0a34b59` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-bc232394-c46f-4c63-9c10-43b021850b7a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-2d3f5539-bc0b-4c78-af74-28a7ad706455` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-bf682ab0-ef3d-4ca2-9ed0-d677325734ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ae06815-2d91-4f28-a9c2-e4d13b09b23e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ae06815-2d91-4f28-a9c2-e4d13b09b23e
Content-Type: application/json

--- request body ---
{"handle":"qa-1b86d1e7bde8","displayName":"QA 1b86d1e7bde8","password":"****","region":"eu"}

--- response: 201 in 338 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ae06815-2d91-4f28-a9c2-e4d13b09b23e
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
Location: /v1/accounts/qa-1b86d1e7bde8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_943096aa-9772-41fc-a4e8-042fb97aa47b","handle":"qa-1b86d1e7bde8","displayName":"QA 1b86d1e7bde8","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.041680235Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c8b8d272-9bbe-4a91-809e-fd599e68c5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b8d272-9bbe-4a91-809e-fd599e68c5cc
Content-Type: application/json

--- request body ---
{"handle":"qa-978f1b87abbe","displayName":"QA 978f1b87abbe","password":"****","region":"us"}

--- response: 201 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8b8d272-9bbe-4a91-809e-fd599e68c5cc
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
Location: /v1/accounts/qa-978f1b87abbe
X-Served-Region: us
Content-Length: 181

{"id":"acc_65bf5487-20f7-4e84-a755-34dcbe72838d","handle":"qa-978f1b87abbe","displayName":"QA 978f1b87abbe","region":"us","role":"user","createdAt":"2026-11-11T09:34:31.355671637Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d508cae4-032c-4f39-aca5-c1dcbb53fb8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d508cae4-032c-4f39-aca5-c1dcbb53fb8b
Content-Type: application/json

--- request body ---
{"handle":"qa-1b86d1e7bde8","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d508cae4-032c-4f39-aca5-c1dcbb53fb8b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_943096aa-9772-41fc-a4e8-042fb97aa47b"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-08991880-0fd3-42ab-9642-3e9a891fd351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08991880-0fd3-42ab-9642-3e9a891fd351
Content-Type: application/json

--- request body ---
{"handle":"qa-1b86d1e7bde8","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-08991880-0fd3-42ab-9642-3e9a891fd351
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_943096aa-9772-41fc-a4e8-042fb97aa47b"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fb32033-0e3d-4b36-90d7-fd7ac54319bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fb32033-0e3d-4b36-90d7-fd7ac54319bc
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fb32033-0e3d-4b36-90d7-fd7ac54319bc
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

{"id":"acc_943096aa-9772-41fc-a4e8-042fb97aa47b","handle":"qa-1b86d1e7bde8","displayName":"QA 1b86d1e7bde8","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.041680235Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-978f1b87abbe
correlation: qa-27fe4d6d-a8bd-4fee-81f7-3d9bb64cf763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27fe4d6d-a8bd-4fee-81f7-3d9bb64cf763
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-27fe4d6d-a8bd-4fee-81f7-3d9bb64cf763
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

{"handle":"qa-978f1b87abbe","displayName":"QA 978f1b87abbe","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ef508f70-174a-4b39-89d6-d0d13593e22e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef508f70-174a-4b39-89d6-d0d13593e22e
Content-Type: application/json

--- request body ---
{"handle":"qa-978f1b87abbe","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef508f70-174a-4b39-89d6-d0d13593e22e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65bf5487-20f7-4e84-a755-34dcbe72838d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf1e099c-8dd5-45ea-a1ed-2061d0a34b59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf1e099c-8dd5-45ea-a1ed-2061d0a34b59
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf1e099c-8dd5-45ea-a1ed-2061d0a34b59
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
correlation: qa-bc232394-c46f-4c63-9c10-43b021850b7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc232394-c46f-4c63-9c10-43b021850b7a
Content-Type: application/json

--- request body ---
{"handle":"qa-978f1b87abbe","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc232394-c46f-4c63-9c10-43b021850b7a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc232394-c46f-4c63-9c10-43b021850b7a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d3f5539-bc0b-4c78-af74-28a7ad706455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d3f5539-bc0b-4c78-af74-28a7ad706455
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d3f5539-bc0b-4c78-af74-28a7ad706455
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
correlation: qa-bf682ab0-ef3d-4ca2-9ed0-d677325734ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf682ab0-ef3d-4ca2-9ed0-d677325734ea
Content-Type: application/json

--- request body ---
{"handle":"qa-1b86d1e7bde8","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf682ab0-ef3d-4ca2-9ed0-d677325734ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf682ab0-ef3d-4ca2-9ed0-d677325734ea"}
```
