# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-f32605ef-0a2f-4916-a151-abe92ba5bd16` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-bfd0b595-672e-424d-adb7-65c7ca70fb18` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-ebae6246-865e-4b2a-8efa-0dd434fbd88c` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-7f17b29e-31df-4237-804c-0e70b5094956` |
| 5 | `POST /v1/credits/purchases` | 400 | 31 | `qa-1c0f8e5d-1086-47d7-bc17-b85e19d5bcf0` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-6f5667d6-043e-4ea9-8d59-bf74fd84572b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-a8bcbab9-5140-4a2a-a80b-31cdf911d25a` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-8afae993-aae2-47be-bd2f-3ce8c00b5335` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-3742fab9-c62c-46e5-be47-c4c1553b94d2` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-1f5e8c6e-196f-4d79-bfd5-9f38fd271a49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f32605ef-0a2f-4916-a151-abe92ba5bd16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f32605ef-0a2f-4916-a151-abe92ba5bd16
Content-Type: application/json

--- request body ---
{"handle":"qa-db3b6f55fdb0","displayName":"QA db3b6f55fdb0","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f32605ef-0a2f-4916-a151-abe92ba5bd16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Location: /v1/accounts/qa-db3b6f55fdb0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf205f6a-4cd4-4ff1-bd57-10b8e57c5b19","handle":"qa-db3b6f55fdb0","displayName":"QA db3b6f55fdb0","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.494488777Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bfd0b595-672e-424d-adb7-65c7ca70fb18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfd0b595-672e-424d-adb7-65c7ca70fb18
Content-Type: application/json

--- request body ---
{"handle":"qa-744eabb5e9bd","displayName":"QA 744eabb5e9bd","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfd0b595-672e-424d-adb7-65c7ca70fb18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Location: /v1/accounts/qa-744eabb5e9bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b7c26f9-47eb-414c-bf18-a0b3b3d5a1de","handle":"qa-744eabb5e9bd","displayName":"QA 744eabb5e9bd","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.565997325Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ebae6246-865e-4b2a-8efa-0dd434fbd88c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebae6246-865e-4b2a-8efa-0dd434fbd88c
Content-Type: application/json

--- request body ---
{"handle":"qa-db3b6f55fdb0","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebae6246-865e-4b2a-8efa-0dd434fbd88c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf205f6a-4cd4-4ff1-bd57-10b8e57c5b19"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7f17b29e-31df-4237-804c-0e70b5094956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f17b29e-31df-4237-804c-0e70b5094956
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-744eabb5e9bd","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f17b29e-31df-4237-804c-0e70b5094956
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
Location: /v1/conversations/cnv_26fa8fce-4d7b-47c7-bdd2-65dc09858569
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_26fa8fce-4d7b-47c7-bdd2-65dc09858569","subject":"Error contract","status":"open","region":"eu","participants":["qa-db3b6f55fdb0","qa-744eabb5e9bd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.635232837Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1c0f8e5d-1086-47d7-bc17-b85e19d5bcf0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2947e2ea05bf4d4eb798dc0943105889
X-Correlation-Id: qa-1c0f8e5d-1086-47d7-bc17-b85e19d5bcf0
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c0f8e5d-1086-47d7-bc17-b85e19d5bcf0
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-1c0f8e5d-1086-47d7-bc17-b85e19d5bcf0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6f5667d6-043e-4ea9-8d59-bf74fd84572b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f5667d6-043e-4ea9-8d59-bf74fd84572b
Content-Type: application/json

--- request body ---
{"handle":"qa-744eabb5e9bd","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f5667d6-043e-4ea9-8d59-bf74fd84572b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b7c26f9-47eb-414c-bf18-a0b3b3d5a1de"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8bcbab9-5140-4a2a-a80b-31cdf911d25a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8bcbab9-5140-4a2a-a80b-31cdf911d25a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8bcbab9-5140-4a2a-a80b-31cdf911d25a
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
correlation: qa-8afae993-aae2-47be-bd2f-3ce8c00b5335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8afae993-aae2-47be-bd2f-3ce8c00b5335
Content-Type: application/json

--- request body ---
{"handle":"qa-744eabb5e9bd","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8afae993-aae2-47be-bd2f-3ce8c00b5335
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8afae993-aae2-47be-bd2f-3ce8c00b5335"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3742fab9-c62c-46e5-be47-c4c1553b94d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3742fab9-c62c-46e5-be47-c4c1553b94d2
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3742fab9-c62c-46e5-be47-c4c1553b94d2
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
correlation: qa-1f5e8c6e-196f-4d79-bfd5-9f38fd271a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f5e8c6e-196f-4d79-bfd5-9f38fd271a49
Content-Type: application/json

--- request body ---
{"handle":"qa-db3b6f55fdb0","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f5e8c6e-196f-4d79-bfd5-9f38fd271a49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f5e8c6e-196f-4d79-bfd5-9f38fd271a49"}
```
