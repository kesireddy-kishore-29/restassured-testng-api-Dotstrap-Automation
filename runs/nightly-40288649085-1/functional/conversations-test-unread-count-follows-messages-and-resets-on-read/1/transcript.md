# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 487 | `qa-f8dca3bd-b0ad-43db-937f-25ed43b7e91e` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-9a2fa602-4fef-4269-baae-2edf19ea508a` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-3db517c1-3415-4e7f-9f95-02c118738443` |
| 4 | `POST /v1/conversations` | 201 | 72 | `qa-53f5389f-78af-4864-82d9-b4b1317d457f` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 38 | `qa-53400cbc-4600-4294-8a1a-7fb2ee435a3b` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-5fd56cfe-449a-4dcc-8007-7b9dbbd941f7` |
| 7 | `GET /v1/conversations/{id}` | 200 | 32 | `qa-c4b3a097-d234-445c-bf68-505482a40cc2` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 24 | `qa-fa6e50d9-80dc-48f4-89a2-13dd4196e23e` |
| 9 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-20db1c83-6743-41c4-b737-c4f092bb7adc` |
| 10 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-f8bfd0be-8119-412a-9f81-c02346a1854b` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-740ec54b-d615-4531-baa1-0aa8fb3c55ac` |
| 12 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b0c4be3b-49fc-4671-a6e0-810e9c2d24c3` |
| 13 | `POST /v1/auth/token` | 401 | 13 | `qa-12b76bfc-05e7-4c00-b487-d858d212ae0b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f8dca3bd-b0ad-43db-937f-25ed43b7e91e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8dca3bd-b0ad-43db-937f-25ed43b7e91e
Content-Type: application/json

--- request body ---
{"handle":"qa-ea167a0de3df","displayName":"QA ea167a0de3df","password":"****","region":"eu"}

--- response: 201 in 487 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8dca3bd-b0ad-43db-937f-25ed43b7e91e
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
Location: /v1/accounts/qa-ea167a0de3df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba99d6ad-70a9-4336-a11d-2ef15c88f609","handle":"qa-ea167a0de3df","displayName":"QA ea167a0de3df","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.761124551Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9a2fa602-4fef-4269-baae-2edf19ea508a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a2fa602-4fef-4269-baae-2edf19ea508a
Content-Type: application/json

--- request body ---
{"handle":"qa-f82faadcf95c","displayName":"QA f82faadcf95c","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a2fa602-4fef-4269-baae-2edf19ea508a
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
Location: /v1/accounts/qa-f82faadcf95c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_286c335e-d38c-4481-8546-53b7ebe58c50","handle":"qa-f82faadcf95c","displayName":"QA f82faadcf95c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.219334046Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3db517c1-3415-4e7f-9f95-02c118738443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3db517c1-3415-4e7f-9f95-02c118738443
Content-Type: application/json

--- request body ---
{"handle":"qa-ea167a0de3df","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3db517c1-3415-4e7f-9f95-02c118738443
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba99d6ad-70a9-4336-a11d-2ef15c88f609"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-53f5389f-78af-4864-82d9-b4b1317d457f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53f5389f-78af-4864-82d9-b4b1317d457f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f82faadcf95c","subject":"Updates","message":"First"}

--- response: 201 in 72 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-53f5389f-78af-4864-82d9-b4b1317d457f
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
Location: /v1/conversations/cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a","subject":"Updates","status":"open","region":"eu","participants":["qa-ea167a0de3df","qa-f82faadcf95c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:42.364321062Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a/messages
correlation: qa-53400cbc-4600-4294-8a1a-7fb2ee435a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53400cbc-4600-4294-8a1a-7fb2ee435a3b
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-53400cbc-4600-4294-8a1a-7fb2ee435a3b
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
Content-Length: 197

{"id":"msg_746d1351-a6f9-456d-bc84-80b82dc2de36","conversationId":"cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a","sender":"qa-ea167a0de3df","body":"Second","createdAt":"2026-10-26T07:54:42.506672393Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5fd56cfe-449a-4dcc-8007-7b9dbbd941f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd56cfe-449a-4dcc-8007-7b9dbbd941f7
Content-Type: application/json

--- request body ---
{"handle":"qa-f82faadcf95c","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fd56cfe-449a-4dcc-8007-7b9dbbd941f7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_286c335e-d38c-4481-8546-53b7ebe58c50"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a
correlation: qa-c4b3a097-d234-445c-bf68-505482a40cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b3a097-d234-445c-bf68-505482a40cc2
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4b3a097-d234-445c-bf68-505482a40cc2
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a","subject":"Updates","status":"open","region":"eu","participants":["qa-ea167a0de3df","qa-f82faadcf95c"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-26T07:54:42.364321062Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a/read
correlation: qa-fa6e50d9-80dc-48f4-89a2-13dd4196e23e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6e50d9-80dc-48f4-89a2-13dd4196e23e
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa6e50d9-80dc-48f4-89a2-13dd4196e23e
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
Content-Length: 77

{"conversationId":"cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a
correlation: qa-20db1c83-6743-41c4-b737-c4f092bb7adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20db1c83-6743-41c4-b737-c4f092bb7adc
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-20db1c83-6743-41c4-b737-c4f092bb7adc
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_3e4c56d5-9d7e-4a9c-b212-044b8e24361a","subject":"Updates","status":"open","region":"eu","participants":["qa-ea167a0de3df","qa-f82faadcf95c"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-26T07:54:42.364321062Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8bfd0be-8119-412a-9f81-c02346a1854b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8bfd0be-8119-412a-9f81-c02346a1854b
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8bfd0be-8119-412a-9f81-c02346a1854b
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
correlation: qa-740ec54b-d615-4531-baa1-0aa8fb3c55ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-740ec54b-d615-4531-baa1-0aa8fb3c55ac
Content-Type: application/json

--- request body ---
{"handle":"qa-f82faadcf95c","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-740ec54b-d615-4531-baa1-0aa8fb3c55ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-740ec54b-d615-4531-baa1-0aa8fb3c55ac"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b0c4be3b-49fc-4671-a6e0-810e9c2d24c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0c4be3b-49fc-4671-a6e0-810e9c2d24c3
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b0c4be3b-49fc-4671-a6e0-810e9c2d24c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-12b76bfc-05e7-4c00-b487-d858d212ae0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12b76bfc-05e7-4c00-b487-d858d212ae0b
Content-Type: application/json

--- request body ---
{"handle":"qa-ea167a0de3df","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12b76bfc-05e7-4c00-b487-d858d212ae0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12b76bfc-05e7-4c00-b487-d858d212ae0b"}
```
