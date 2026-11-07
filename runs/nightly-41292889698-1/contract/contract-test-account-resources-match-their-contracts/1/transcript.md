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
| 1 | `POST /v1/accounts` | 201 | 439 | `qa-f6cc4e7e-2dcf-41ad-bd3e-8da6cd9543e0` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-6009c253-bebe-479e-a6b1-cded989d93bc` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-97e854fc-d217-4247-b765-01ab5417c2fc` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-dd3f9691-975d-4c8b-9fb1-6c8f2db35fbf` |
| 5 | `GET /v1/accounts/me` | 200 | 37 | `qa-bb43fa69-9261-43ce-ba16-b98437e937df` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 43 | `qa-5d9147f4-8091-445d-8af2-7557b65b165e` |
| 7 | `POST /v1/auth/token` | 200 | 11 | `qa-e587861f-6eb8-4994-a753-bb0e958677fd` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9f97c525-e70c-4648-b16c-bc8e8ffafac1` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-67b6b9bc-d7b1-4c00-9040-4e63587efcb4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-505b33fc-336f-4349-a3d4-6d7f58e9dfc6` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-a585c05b-d99a-4699-8ec1-0aa91e2f9664` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6cc4e7e-2dcf-41ad-bd3e-8da6cd9543e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6cc4e7e-2dcf-41ad-bd3e-8da6cd9543e0
Content-Type: application/json

--- request body ---
{"handle":"qa-c6a2e1799bb8","displayName":"QA c6a2e1799bb8","password":"****","region":"eu"}

--- response: 201 in 439 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6cc4e7e-2dcf-41ad-bd3e-8da6cd9543e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-c6a2e1799bb8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c879271-7968-4591-8c58-f354846ce1cd","handle":"qa-c6a2e1799bb8","displayName":"QA c6a2e1799bb8","region":"eu","role":"user","createdAt":"2026-11-01T09:23:26.932337652Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6009c253-bebe-479e-a6b1-cded989d93bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6009c253-bebe-479e-a6b1-cded989d93bc
Content-Type: application/json

--- request body ---
{"handle":"qa-51e7e76bb79e","displayName":"QA 51e7e76bb79e","password":"****","region":"us"}

--- response: 201 in 39 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-6009c253-bebe-479e-a6b1-cded989d93bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-51e7e76bb79e
X-Served-Region: us
Content-Length: 181

{"id":"acc_3d227914-fa4f-4fda-bc82-03f3e85b1cf2","handle":"qa-51e7e76bb79e","displayName":"QA 51e7e76bb79e","region":"us","role":"user","createdAt":"2026-11-01T09:23:27.380436684Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97e854fc-d217-4247-b765-01ab5417c2fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97e854fc-d217-4247-b765-01ab5417c2fc
Content-Type: application/json

--- request body ---
{"handle":"qa-c6a2e1799bb8","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-97e854fc-d217-4247-b765-01ab5417c2fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c879271-7968-4591-8c58-f354846ce1cd"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-dd3f9691-975d-4c8b-9fb1-6c8f2db35fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd3f9691-975d-4c8b-9fb1-6c8f2db35fbf
Content-Type: application/json

--- request body ---
{"handle":"qa-c6a2e1799bb8","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd3f9691-975d-4c8b-9fb1-6c8f2db35fbf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c879271-7968-4591-8c58-f354846ce1cd"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb43fa69-9261-43ce-ba16-b98437e937df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb43fa69-9261-43ce-ba16-b98437e937df
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb43fa69-9261-43ce-ba16-b98437e937df
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

{"id":"acc_4c879271-7968-4591-8c58-f354846ce1cd","handle":"qa-c6a2e1799bb8","displayName":"QA c6a2e1799bb8","region":"eu","role":"user","createdAt":"2026-11-01T09:23:26.932337652Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-51e7e76bb79e
correlation: qa-5d9147f4-8091-445d-8af2-7557b65b165e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d9147f4-8091-445d-8af2-7557b65b165e
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d9147f4-8091-445d-8af2-7557b65b165e
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

{"handle":"qa-51e7e76bb79e","displayName":"QA 51e7e76bb79e","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e587861f-6eb8-4994-a753-bb0e958677fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e587861f-6eb8-4994-a753-bb0e958677fd
Content-Type: application/json

--- request body ---
{"handle":"qa-51e7e76bb79e","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e587861f-6eb8-4994-a753-bb0e958677fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d227914-fa4f-4fda-bc82-03f3e85b1cf2"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f97c525-e70c-4648-b16c-bc8e8ffafac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f97c525-e70c-4648-b16c-bc8e8ffafac1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f97c525-e70c-4648-b16c-bc8e8ffafac1
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
correlation: qa-67b6b9bc-d7b1-4c00-9040-4e63587efcb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67b6b9bc-d7b1-4c00-9040-4e63587efcb4
Content-Type: application/json

--- request body ---
{"handle":"qa-51e7e76bb79e","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67b6b9bc-d7b1-4c00-9040-4e63587efcb4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67b6b9bc-d7b1-4c00-9040-4e63587efcb4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-505b33fc-336f-4349-a3d4-6d7f58e9dfc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-505b33fc-336f-4349-a3d4-6d7f58e9dfc6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-505b33fc-336f-4349-a3d4-6d7f58e9dfc6
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
correlation: qa-a585c05b-d99a-4699-8ec1-0aa91e2f9664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a585c05b-d99a-4699-8ec1-0aa91e2f9664
Content-Type: application/json

--- request body ---
{"handle":"qa-c6a2e1799bb8","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a585c05b-d99a-4699-8ec1-0aa91e2f9664
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a585c05b-d99a-4699-8ec1-0aa91e2f9664"}
```
