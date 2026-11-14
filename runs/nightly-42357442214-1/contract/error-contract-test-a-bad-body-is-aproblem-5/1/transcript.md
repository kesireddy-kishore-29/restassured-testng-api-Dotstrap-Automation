# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-e979fa9a-c22e-435d-a96b-54a8ae659cc0` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-c80621c8-9e43-488d-9220-dc7d53eeed77` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-8f326a10-2356-4984-9697-a8d18560830e` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-65723222-4b27-4988-9316-cf4fd9f120b5` |
| 5 | `POST /v1/accounts` | 422 | 26 | `qa-7c6096c7-819e-4f93-86c0-3b93fcac9a08` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-bdd444f8-ea74-49e4-88c0-ea8dfa62ba8d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-51e474de-4461-4432-a622-ff11dd2fb743` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-0ec3adec-2b4b-431d-b6bb-88d59b7dd019` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-9f37abe3-7179-42a1-baf9-ce0750ddeda7` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-8999a844-676e-4343-a9bd-f341450b9f89` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e979fa9a-c22e-435d-a96b-54a8ae659cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e979fa9a-c22e-435d-a96b-54a8ae659cc0
Content-Type: application/json

--- request body ---
{"handle":"qa-b73bd34cb565","displayName":"QA b73bd34cb565","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e979fa9a-c22e-435d-a96b-54a8ae659cc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-b73bd34cb565
X-Served-Region: eu
Content-Length: 181

{"id":"acc_077cab1d-5d11-44d1-b5d9-7c49a0b532e3","handle":"qa-b73bd34cb565","displayName":"QA b73bd34cb565","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.414319642Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c80621c8-9e43-488d-9220-dc7d53eeed77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c80621c8-9e43-488d-9220-dc7d53eeed77
Content-Type: application/json

--- request body ---
{"handle":"qa-3719a9b2d36d","displayName":"QA 3719a9b2d36d","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c80621c8-9e43-488d-9220-dc7d53eeed77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-3719a9b2d36d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d50c5b20-d7fb-4a1d-ba4d-a59575ab349f","handle":"qa-3719a9b2d36d","displayName":"QA 3719a9b2d36d","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.511090824Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f326a10-2356-4984-9697-a8d18560830e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f326a10-2356-4984-9697-a8d18560830e
Content-Type: application/json

--- request body ---
{"handle":"qa-b73bd34cb565","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f326a10-2356-4984-9697-a8d18560830e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_077cab1d-5d11-44d1-b5d9-7c49a0b532e3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-65723222-4b27-4988-9316-cf4fd9f120b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65723222-4b27-4988-9316-cf4fd9f120b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3719a9b2d36d","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-65723222-4b27-4988-9316-cf4fd9f120b5
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
Location: /v1/conversations/cnv_76576b6b-c1ec-4d60-9193-4c78ec0d2299
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_76576b6b-c1ec-4d60-9193-4c78ec0d2299","subject":"Error contract","status":"open","region":"eu","participants":["qa-b73bd34cb565","qa-3719a9b2d36d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.604619359Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-7c6096c7-819e-4f93-86c0-3b93fcac9a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c6096c7-819e-4f93-86c0-3b93fcac9a08
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c6096c7-819e-4f93-86c0-3b93fcac9a08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-7c6096c7-819e-4f93-86c0-3b93fcac9a08","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bdd444f8-ea74-49e4-88c0-ea8dfa62ba8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdd444f8-ea74-49e4-88c0-ea8dfa62ba8d
Content-Type: application/json

--- request body ---
{"handle":"qa-3719a9b2d36d","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdd444f8-ea74-49e4-88c0-ea8dfa62ba8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d50c5b20-d7fb-4a1d-ba4d-a59575ab349f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-51e474de-4461-4432-a622-ff11dd2fb743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51e474de-4461-4432-a622-ff11dd2fb743
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-51e474de-4461-4432-a622-ff11dd2fb743
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-0ec3adec-2b4b-431d-b6bb-88d59b7dd019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec3adec-2b4b-431d-b6bb-88d59b7dd019
Content-Type: application/json

--- request body ---
{"handle":"qa-3719a9b2d36d","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ec3adec-2b4b-431d-b6bb-88d59b7dd019
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ec3adec-2b4b-431d-b6bb-88d59b7dd019"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f37abe3-7179-42a1-baf9-ce0750ddeda7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f37abe3-7179-42a1-baf9-ce0750ddeda7
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f37abe3-7179-42a1-baf9-ce0750ddeda7
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8999a844-676e-4343-a9bd-f341450b9f89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8999a844-676e-4343-a9bd-f341450b9f89
Content-Type: application/json

--- request body ---
{"handle":"qa-b73bd34cb565","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8999a844-676e-4343-a9bd-f341450b9f89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8999a844-676e-4343-a9bd-f341450b9f89"}
```
