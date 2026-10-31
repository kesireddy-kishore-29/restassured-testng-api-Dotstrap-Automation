# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-a6d0ae7e-561d-4ada-95d5-fda086032fba` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-6d8c7a85-210c-47af-8c1e-b7fa5be4bb73` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-4c90f1b4-8e8c-4205-ad1f-15e52872cb52` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-442ae955-eed5-4278-a2b3-ba2dfb293339` |
| 5 | `POST /v1/credits/purchases` | 415 | 5 | `qa-74410b80-ddbb-4637-87cd-323c810cc3c4` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-0adf8fd8-009e-4c47-bd91-3de3245278e0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-41de2632-01c3-4cbb-bcf5-6905932dadec` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-bb25ec84-76c5-4b5e-930c-0d30a8852c04` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-48bf6932-fc5e-4c5c-982d-74fd9bbc1fc8` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-b0bd7a44-0572-4c66-a1fe-85749f078643` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a6d0ae7e-561d-4ada-95d5-fda086032fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d0ae7e-561d-4ada-95d5-fda086032fba
Content-Type: application/json

--- request body ---
{"handle":"qa-a8bcc2bcbf58","displayName":"QA a8bcc2bcbf58","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6d0ae7e-561d-4ada-95d5-fda086032fba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Location: /v1/accounts/qa-a8bcc2bcbf58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d721112-810c-4388-81b5-a49503a318df","handle":"qa-a8bcc2bcbf58","displayName":"QA a8bcc2bcbf58","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.176473463Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6d8c7a85-210c-47af-8c1e-b7fa5be4bb73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d8c7a85-210c-47af-8c1e-b7fa5be4bb73
Content-Type: application/json

--- request body ---
{"handle":"qa-78cd2f7d37a0","displayName":"QA 78cd2f7d37a0","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d8c7a85-210c-47af-8c1e-b7fa5be4bb73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Location: /v1/accounts/qa-78cd2f7d37a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44ee6295-7b7c-4118-851b-600ea9a74bd9","handle":"qa-78cd2f7d37a0","displayName":"QA 78cd2f7d37a0","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.215759913Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4c90f1b4-8e8c-4205-ad1f-15e52872cb52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c90f1b4-8e8c-4205-ad1f-15e52872cb52
Content-Type: application/json

--- request body ---
{"handle":"qa-a8bcc2bcbf58","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c90f1b4-8e8c-4205-ad1f-15e52872cb52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d721112-810c-4388-81b5-a49503a318df"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-442ae955-eed5-4278-a2b3-ba2dfb293339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-442ae955-eed5-4278-a2b3-ba2dfb293339
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78cd2f7d37a0","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-442ae955-eed5-4278-a2b3-ba2dfb293339
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
Location: /v1/conversations/cnv_8620c84a-5487-4a0d-a6e8-05e056c80bfe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8620c84a-5487-4a0d-a6e8-05e056c80bfe","subject":"Error contract","status":"open","region":"eu","participants":["qa-a8bcc2bcbf58","qa-78cd2f7d37a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:27.270010133Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-74410b80-ddbb-4637-87cd-323c810cc3c4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b3d08cf3d24c441c86d02f9d633ca901
X-Correlation-Id: qa-74410b80-ddbb-4637-87cd-323c810cc3c4
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74410b80-ddbb-4637-87cd-323c810cc3c4
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-74410b80-ddbb-4637-87cd-323c810cc3c4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0adf8fd8-009e-4c47-bd91-3de3245278e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0adf8fd8-009e-4c47-bd91-3de3245278e0
Content-Type: application/json

--- request body ---
{"handle":"qa-78cd2f7d37a0","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-0adf8fd8-009e-4c47-bd91-3de3245278e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44ee6295-7b7c-4118-851b-600ea9a74bd9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41de2632-01c3-4cbb-bcf5-6905932dadec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41de2632-01c3-4cbb-bcf5-6905932dadec
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41de2632-01c3-4cbb-bcf5-6905932dadec
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
correlation: qa-bb25ec84-76c5-4b5e-930c-0d30a8852c04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb25ec84-76c5-4b5e-930c-0d30a8852c04
Content-Type: application/json

--- request body ---
{"handle":"qa-78cd2f7d37a0","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb25ec84-76c5-4b5e-930c-0d30a8852c04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb25ec84-76c5-4b5e-930c-0d30a8852c04"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48bf6932-fc5e-4c5c-982d-74fd9bbc1fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48bf6932-fc5e-4c5c-982d-74fd9bbc1fc8
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48bf6932-fc5e-4c5c-982d-74fd9bbc1fc8
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b0bd7a44-0572-4c66-a1fe-85749f078643

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0bd7a44-0572-4c66-a1fe-85749f078643
Content-Type: application/json

--- request body ---
{"handle":"qa-a8bcc2bcbf58","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0bd7a44-0572-4c66-a1fe-85749f078643
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0bd7a44-0572-4c66-a1fe-85749f078643"}
```
