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
| 1 | `POST /v1/accounts` | 201 | 367 | `qa-64de2aee-f94c-40f4-85cd-8fca8a0f7c19` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-3cb19d92-35d9-4758-9a04-377f5d73b321` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-f5eabd7a-38f0-4f7f-9d5c-ce81e4b95198` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-c4265c7e-225a-4d28-982d-77434d39e7d8` |
| 5 | `GET /v1/accounts/me` | 200 | 27 | `qa-ae39ffb8-bcda-4ad7-8876-0210dd722ddd` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 36 | `qa-5238eb96-519e-4909-badc-8c37cc5b2ec2` |
| 7 | `POST /v1/auth/token` | 200 | 19 | `qa-534ca377-f9d2-4141-b0d4-b6300c76e825` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-abfc9c35-e3b3-4980-a3a4-92621a348585` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-7b82a64f-1c5f-43e5-904f-26229dbc4882` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-aeabef83-d37b-4117-9410-b5912ef0a858` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-d5350dcc-0ca4-47e6-abc6-76eaab82b43e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-64de2aee-f94c-40f4-85cd-8fca8a0f7c19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64de2aee-f94c-40f4-85cd-8fca8a0f7c19
Content-Type: application/json

--- request body ---
{"handle":"qa-13f9fa55db45","displayName":"QA 13f9fa55db45","password":"****","region":"eu"}

--- response: 201 in 367 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-64de2aee-f94c-40f4-85cd-8fca8a0f7c19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-13f9fa55db45
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dae51d29-682f-43d5-a63d-542917a14575","handle":"qa-13f9fa55db45","displayName":"QA 13f9fa55db45","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.579768958Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3cb19d92-35d9-4758-9a04-377f5d73b321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cb19d92-35d9-4758-9a04-377f5d73b321
Content-Type: application/json

--- request body ---
{"handle":"qa-06d97df9eac7","displayName":"QA 06d97df9eac7","password":"****","region":"us"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cb19d92-35d9-4758-9a04-377f5d73b321
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
Location: /v1/accounts/qa-06d97df9eac7
X-Served-Region: us
Content-Length: 181

{"id":"acc_a6330099-a4e3-41cf-bf9e-b8503b04f53d","handle":"qa-06d97df9eac7","displayName":"QA 06d97df9eac7","region":"us","role":"user","createdAt":"2026-10-24T07:25:04.871042075Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f5eabd7a-38f0-4f7f-9d5c-ce81e4b95198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5eabd7a-38f0-4f7f-9d5c-ce81e4b95198
Content-Type: application/json

--- request body ---
{"handle":"qa-13f9fa55db45","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5eabd7a-38f0-4f7f-9d5c-ce81e4b95198
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dae51d29-682f-43d5-a63d-542917a14575"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c4265c7e-225a-4d28-982d-77434d39e7d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4265c7e-225a-4d28-982d-77434d39e7d8
Content-Type: application/json

--- request body ---
{"handle":"qa-13f9fa55db45","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4265c7e-225a-4d28-982d-77434d39e7d8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dae51d29-682f-43d5-a63d-542917a14575"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae39ffb8-bcda-4ad7-8876-0210dd722ddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae39ffb8-bcda-4ad7-8876-0210dd722ddd
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae39ffb8-bcda-4ad7-8876-0210dd722ddd
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

{"id":"acc_dae51d29-682f-43d5-a63d-542917a14575","handle":"qa-13f9fa55db45","displayName":"QA 13f9fa55db45","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.579768958Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-06d97df9eac7
correlation: qa-5238eb96-519e-4909-badc-8c37cc5b2ec2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5238eb96-519e-4909-badc-8c37cc5b2ec2
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5238eb96-519e-4909-badc-8c37cc5b2ec2
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

{"handle":"qa-06d97df9eac7","displayName":"QA 06d97df9eac7","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-534ca377-f9d2-4141-b0d4-b6300c76e825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-534ca377-f9d2-4141-b0d4-b6300c76e825
Content-Type: application/json

--- request body ---
{"handle":"qa-06d97df9eac7","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-534ca377-f9d2-4141-b0d4-b6300c76e825
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6330099-a4e3-41cf-bf9e-b8503b04f53d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abfc9c35-e3b3-4980-a3a4-92621a348585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfc9c35-e3b3-4980-a3a4-92621a348585
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abfc9c35-e3b3-4980-a3a4-92621a348585
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
correlation: qa-7b82a64f-1c5f-43e5-904f-26229dbc4882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b82a64f-1c5f-43e5-904f-26229dbc4882
Content-Type: application/json

--- request body ---
{"handle":"qa-06d97df9eac7","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b82a64f-1c5f-43e5-904f-26229dbc4882
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b82a64f-1c5f-43e5-904f-26229dbc4882"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aeabef83-d37b-4117-9410-b5912ef0a858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeabef83-d37b-4117-9410-b5912ef0a858
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aeabef83-d37b-4117-9410-b5912ef0a858
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
correlation: qa-d5350dcc-0ca4-47e6-abc6-76eaab82b43e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5350dcc-0ca4-47e6-abc6-76eaab82b43e
Content-Type: application/json

--- request body ---
{"handle":"qa-13f9fa55db45","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5350dcc-0ca4-47e6-abc6-76eaab82b43e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5350dcc-0ca4-47e6-abc6-76eaab82b43e"}
```
