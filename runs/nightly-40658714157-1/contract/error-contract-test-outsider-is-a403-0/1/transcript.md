# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-d1895061-85f2-4199-a8c9-eb3b6a0ebe40` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-b09d1568-3e96-4bb9-a835-40f05d49fa96` |
| 3 | `POST /v1/accounts` | 201 | 16 | `qa-d2987e01-f2e9-41d3-8d5e-c2113bd1f137` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-b908a9b2-a88c-4bd9-bbc5-7f85924524d9` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-ff590f55-901a-407d-97bb-171b11073556` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-d8b8158a-c1b8-41f1-8545-7c3c766b866a` |
| 7 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-4dad2019-7e47-4972-a1d9-86b6a46e7575` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b84055cb-c74b-4ca2-9dd3-a99e9fa1076b` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-e31532ee-cf7a-4369-87b5-c61907e2328d` |
| 10 | `POST /v1/auth/token` | 200 | 35 | `qa-21a4047a-b30c-425c-ba12-38a5299ac2ee` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-225483b2-7c19-4804-9d85-de72832fed25` |
| 12 | `POST /v1/auth/token` | 401 | 12 | `qa-58daf303-3e9a-4dce-90d7-895ee41edad2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d34734cf-e288-4d62-84c1-50c91fe44664` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-d0a6614a-3bd0-49ea-a042-dfe4d4dbd4a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d1895061-85f2-4199-a8c9-eb3b6a0ebe40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1895061-85f2-4199-a8c9-eb3b6a0ebe40
Content-Type: application/json

--- request body ---
{"handle":"qa-730a44f5cce0","displayName":"QA 730a44f5cce0","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1895061-85f2-4199-a8c9-eb3b6a0ebe40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Location: /v1/accounts/qa-730a44f5cce0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8f75efb-a0bb-4f5a-b214-776594bf96ac","handle":"qa-730a44f5cce0","displayName":"QA 730a44f5cce0","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.534136697Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b09d1568-3e96-4bb9-a835-40f05d49fa96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09d1568-3e96-4bb9-a835-40f05d49fa96
Content-Type: application/json

--- request body ---
{"handle":"qa-3eb23b577b6d","displayName":"QA 3eb23b577b6d","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09d1568-3e96-4bb9-a835-40f05d49fa96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 10
Location: /v1/accounts/qa-3eb23b577b6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0dc475a9-e6c5-4fd9-9aa4-99d7d3f13cf2","handle":"qa-3eb23b577b6d","displayName":"QA 3eb23b577b6d","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.553173595Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d2987e01-f2e9-41d3-8d5e-c2113bd1f137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2987e01-f2e9-41d3-8d5e-c2113bd1f137
Content-Type: application/json

--- request body ---
{"handle":"qa-8ffd6fa9a543","displayName":"QA 8ffd6fa9a543","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2987e01-f2e9-41d3-8d5e-c2113bd1f137
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 10
Location: /v1/accounts/qa-8ffd6fa9a543
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2faba52c-2319-493b-a1a3-b76e8ec9b1b4","handle":"qa-8ffd6fa9a543","displayName":"QA 8ffd6fa9a543","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.565868863Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b908a9b2-a88c-4bd9-bbc5-7f85924524d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b908a9b2-a88c-4bd9-bbc5-7f85924524d9
Content-Type: application/json

--- request body ---
{"handle":"qa-730a44f5cce0","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b908a9b2-a88c-4bd9-bbc5-7f85924524d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8f75efb-a0bb-4f5a-b214-776594bf96ac"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ff590f55-901a-407d-97bb-171b11073556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff590f55-901a-407d-97bb-171b11073556
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3eb23b577b6d","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff590f55-901a-407d-97bb-171b11073556
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
Location: /v1/conversations/cnv_49ed58ac-2805-490a-a4a6-398c1bc85a8f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_49ed58ac-2805-490a-a4a6-398c1bc85a8f","subject":"Error contract","status":"open","region":"eu","participants":["qa-730a44f5cce0","qa-3eb23b577b6d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.621215896Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d8b8158a-c1b8-41f1-8545-7c3c766b866a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b8158a-c1b8-41f1-8545-7c3c766b866a
Content-Type: application/json

--- request body ---
{"handle":"qa-8ffd6fa9a543","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8b8158a-c1b8-41f1-8545-7c3c766b866a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2faba52c-2319-493b-a1a3-b76e8ec9b1b4"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_49ed58ac-2805-490a-a4a6-398c1bc85a8f
correlation: qa-4dad2019-7e47-4972-a1d9-86b6a46e7575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dad2019-7e47-4972-a1d9-86b6a46e7575
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dad2019-7e47-4972-a1d9-86b6a46e7575
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_49ed58ac-2805-490a-a4a6-398c1bc85a8f","correlationId":"qa-4dad2019-7e47-4972-a1d9-86b6a46e7575"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b84055cb-c74b-4ca2-9dd3-a99e9fa1076b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b84055cb-c74b-4ca2-9dd3-a99e9fa1076b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b84055cb-c74b-4ca2-9dd3-a99e9fa1076b
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
correlation: qa-e31532ee-cf7a-4369-87b5-c61907e2328d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e31532ee-cf7a-4369-87b5-c61907e2328d
Content-Type: application/json

--- request body ---
{"handle":"qa-8ffd6fa9a543","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e31532ee-cf7a-4369-87b5-c61907e2328d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e31532ee-cf7a-4369-87b5-c61907e2328d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-21a4047a-b30c-425c-ba12-38a5299ac2ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a4047a-b30c-425c-ba12-38a5299ac2ee
Content-Type: application/json

--- request body ---
{"handle":"qa-3eb23b577b6d","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-21a4047a-b30c-425c-ba12-38a5299ac2ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0dc475a9-e6c5-4fd9-9aa4-99d7d3f13cf2"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-225483b2-7c19-4804-9d85-de72832fed25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-225483b2-7c19-4804-9d85-de72832fed25
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-225483b2-7c19-4804-9d85-de72832fed25
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
correlation: qa-58daf303-3e9a-4dce-90d7-895ee41edad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58daf303-3e9a-4dce-90d7-895ee41edad2
Content-Type: application/json

--- request body ---
{"handle":"qa-3eb23b577b6d","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58daf303-3e9a-4dce-90d7-895ee41edad2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58daf303-3e9a-4dce-90d7-895ee41edad2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d34734cf-e288-4d62-84c1-50c91fe44664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d34734cf-e288-4d62-84c1-50c91fe44664
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d34734cf-e288-4d62-84c1-50c91fe44664
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
correlation: qa-d0a6614a-3bd0-49ea-a042-dfe4d4dbd4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a6614a-3bd0-49ea-a042-dfe4d4dbd4a1
Content-Type: application/json

--- request body ---
{"handle":"qa-730a44f5cce0","password":"****"}

--- response: 401 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0a6614a-3bd0-49ea-a042-dfe4d4dbd4a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0a6614a-3bd0-49ea-a042-dfe4d4dbd4a1"}
```
