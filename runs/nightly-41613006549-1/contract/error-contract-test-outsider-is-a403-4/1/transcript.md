# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-636e2bf9-a8bd-4a11-8d0b-171159dd29f9` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-e53ef0a1-a2f4-466a-9b00-4f3707848323` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-3b729286-bf79-490c-92f4-ba3286323243` |
| 4 | `POST /v1/auth/token` | 200 | 32 | `qa-949557a2-1a98-445a-a1f7-aa6ebffb78af` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-27af53bb-86d6-44ca-9df9-b749685a1cda` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-20b94832-05c6-45c2-a78a-1291f3e397bc` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 38 | `qa-e5005f5b-9a9c-4108-9982-835c707155bf` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-59d3a491-7a14-4e82-9049-67d86112045f` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-f0a25974-880f-4983-9b8f-fef60a0b00a4` |
| 10 | `POST /v1/auth/token` | 200 | 25 | `qa-fee5b161-1dd0-47f3-a347-6bb65ee48781` |
| 11 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-8eaf61a0-ae51-4c6c-8ab1-eaff05ba8a03` |
| 12 | `POST /v1/auth/token` | 401 | 25 | `qa-7b3777cf-c8b2-4ee4-b5fa-7e6219664341` |
| 13 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-315c2787-ca18-4a7f-9dc4-36f1cf16ab8f` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-1a9ebf8d-3821-44b0-8467-afaadeb6e6e8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-636e2bf9-a8bd-4a11-8d0b-171159dd29f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-636e2bf9-a8bd-4a11-8d0b-171159dd29f9
Content-Type: application/json

--- request body ---
{"handle":"qa-61dbb1cfbe28","displayName":"QA 61dbb1cfbe28","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-636e2bf9-a8bd-4a11-8d0b-171159dd29f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Location: /v1/accounts/qa-61dbb1cfbe28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd0c0152-0495-4e5f-b6cb-55bdab1da38b","handle":"qa-61dbb1cfbe28","displayName":"QA 61dbb1cfbe28","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.345276801Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e53ef0a1-a2f4-466a-9b00-4f3707848323

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e53ef0a1-a2f4-466a-9b00-4f3707848323
Content-Type: application/json

--- request body ---
{"handle":"qa-de628c7351cd","displayName":"QA de628c7351cd","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e53ef0a1-a2f4-466a-9b00-4f3707848323
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Location: /v1/accounts/qa-de628c7351cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abf58d15-acdd-4459-87b9-5be290cc2418","handle":"qa-de628c7351cd","displayName":"QA de628c7351cd","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.387291048Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-3b729286-bf79-490c-92f4-ba3286323243

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b729286-bf79-490c-92f4-ba3286323243
Content-Type: application/json

--- request body ---
{"handle":"qa-dd255d5996a6","displayName":"QA dd255d5996a6","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b729286-bf79-490c-92f4-ba3286323243
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Location: /v1/accounts/qa-dd255d5996a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3135bf28-2fb9-47b3-805c-e2d10250602e","handle":"qa-dd255d5996a6","displayName":"QA dd255d5996a6","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.427878067Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-949557a2-1a98-445a-a1f7-aa6ebffb78af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-949557a2-1a98-445a-a1f7-aa6ebffb78af
Content-Type: application/json

--- request body ---
{"handle":"qa-61dbb1cfbe28","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-949557a2-1a98-445a-a1f7-aa6ebffb78af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd0c0152-0495-4e5f-b6cb-55bdab1da38b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-27af53bb-86d6-44ca-9df9-b749685a1cda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27af53bb-86d6-44ca-9df9-b749685a1cda
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-de628c7351cd","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-27af53bb-86d6-44ca-9df9-b749685a1cda
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
Location: /v1/conversations/cnv_3b58fdb2-9d51-4db4-962a-cc2b3b49ca10
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3b58fdb2-9d51-4db4-962a-cc2b3b49ca10","subject":"Error contract","status":"open","region":"eu","participants":["qa-61dbb1cfbe28","qa-de628c7351cd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.490209669Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-20b94832-05c6-45c2-a78a-1291f3e397bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b94832-05c6-45c2-a78a-1291f3e397bc
Content-Type: application/json

--- request body ---
{"handle":"qa-dd255d5996a6","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-20b94832-05c6-45c2-a78a-1291f3e397bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3135bf28-2fb9-47b3-805c-e2d10250602e"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3b58fdb2-9d51-4db4-962a-cc2b3b49ca10/close
correlation: qa-e5005f5b-9a9c-4108-9982-835c707155bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5005f5b-9a9c-4108-9982-835c707155bf
Content-Type: application/json

--- response: 403 in 38 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5005f5b-9a9c-4108-9982-835c707155bf
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3b58fdb2-9d51-4db4-962a-cc2b3b49ca10/close","correlationId":"qa-e5005f5b-9a9c-4108-9982-835c707155bf"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59d3a491-7a14-4e82-9049-67d86112045f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d3a491-7a14-4e82-9049-67d86112045f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59d3a491-7a14-4e82-9049-67d86112045f
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f0a25974-880f-4983-9b8f-fef60a0b00a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0a25974-880f-4983-9b8f-fef60a0b00a4
Content-Type: application/json

--- request body ---
{"handle":"qa-dd255d5996a6","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0a25974-880f-4983-9b8f-fef60a0b00a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0a25974-880f-4983-9b8f-fef60a0b00a4"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-fee5b161-1dd0-47f3-a347-6bb65ee48781

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fee5b161-1dd0-47f3-a347-6bb65ee48781
Content-Type: application/json

--- request body ---
{"handle":"qa-de628c7351cd","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-fee5b161-1dd0-47f3-a347-6bb65ee48781
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abf58d15-acdd-4459-87b9-5be290cc2418"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8eaf61a0-ae51-4c6c-8ab1-eaff05ba8a03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eaf61a0-ae51-4c6c-8ab1-eaff05ba8a03
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8eaf61a0-ae51-4c6c-8ab1-eaff05ba8a03
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-7b3777cf-c8b2-4ee4-b5fa-7e6219664341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b3777cf-c8b2-4ee4-b5fa-7e6219664341
Content-Type: application/json

--- request body ---
{"handle":"qa-de628c7351cd","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b3777cf-c8b2-4ee4-b5fa-7e6219664341
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b3777cf-c8b2-4ee4-b5fa-7e6219664341"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-315c2787-ca18-4a7f-9dc4-36f1cf16ab8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315c2787-ca18-4a7f-9dc4-36f1cf16ab8f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-315c2787-ca18-4a7f-9dc4-36f1cf16ab8f
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-1a9ebf8d-3821-44b0-8467-afaadeb6e6e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a9ebf8d-3821-44b0-8467-afaadeb6e6e8
Content-Type: application/json

--- request body ---
{"handle":"qa-61dbb1cfbe28","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a9ebf8d-3821-44b0-8467-afaadeb6e6e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a9ebf8d-3821-44b0-8467-afaadeb6e6e8"}
```
