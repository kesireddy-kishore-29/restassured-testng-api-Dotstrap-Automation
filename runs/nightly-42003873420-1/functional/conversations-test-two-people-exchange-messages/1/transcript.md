# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 507 | `qa-2aa71edd-f0d7-43f0-acce-6f565934362b` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-bde8906f-ed15-42f2-8b98-d47d5f865723` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-a1c73352-f0c0-4d5f-a317-d7e306126461` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-80e7a582-29f0-4d09-a483-97cd93ca307b` |
| 5 | `POST /v1/auth/token` | 200 | 25 | `qa-9f4e694f-1436-4e0a-88a4-1f4d060c423c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 28 | `qa-f2144f40-fb77-4728-b7f4-9e5174d0045a` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-0adbdb3c-a79a-49b3-a6a8-14dbc2980870` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3b9acdf6-644c-4bcd-a304-70c5ee9bbf19` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-8dfb9068-f9e8-411c-a867-807f98980e2b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-81a4f75b-3067-4b27-b411-8795ad42b0b6` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-c4f741c2-a28f-43f8-9e55-df7417bde4a4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2aa71edd-f0d7-43f0-acce-6f565934362b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aa71edd-f0d7-43f0-acce-6f565934362b
Content-Type: application/json

--- request body ---
{"handle":"qa-86d08b41804e","displayName":"QA 86d08b41804e","password":"****","region":"eu"}

--- response: 201 in 507 ms ---
Date: Thu, 05 Nov 2026 09:37:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aa71edd-f0d7-43f0-acce-6f565934362b
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
Location: /v1/accounts/qa-86d08b41804e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e517a090-c9a2-4081-bdf4-cf7c5bea134c","handle":"qa-86d08b41804e","displayName":"QA 86d08b41804e","region":"eu","role":"user","createdAt":"2026-11-05T09:37:49.746419726Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bde8906f-ed15-42f2-8b98-d47d5f865723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bde8906f-ed15-42f2-8b98-d47d5f865723
Content-Type: application/json

--- request body ---
{"handle":"qa-6d59bd0edb5e","displayName":"QA 6d59bd0edb5e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-bde8906f-ed15-42f2-8b98-d47d5f865723
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
Location: /v1/accounts/qa-6d59bd0edb5e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_013abe18-e0e5-4e8c-bbe9-750cc84a6a4e","handle":"qa-6d59bd0edb5e","displayName":"QA 6d59bd0edb5e","region":"eu","role":"user","createdAt":"2026-11-05T09:37:50.316851976Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a1c73352-f0c0-4d5f-a317-d7e306126461

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c73352-f0c0-4d5f-a317-d7e306126461
Content-Type: application/json

--- request body ---
{"handle":"qa-86d08b41804e","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1c73352-f0c0-4d5f-a317-d7e306126461
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e517a090-c9a2-4081-bdf4-cf7c5bea134c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-80e7a582-29f0-4d09-a483-97cd93ca307b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80e7a582-29f0-4d09-a483-97cd93ca307b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6d59bd0edb5e","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 62 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-80e7a582-29f0-4d09-a483-97cd93ca307b
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
Location: /v1/conversations/cnv_e10ee91b-399d-4672-8466-99905cd9b111
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_e10ee91b-399d-4672-8466-99905cd9b111","subject":"Lunch?","status":"open","region":"eu","participants":["qa-86d08b41804e","qa-6d59bd0edb5e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:50.452942033Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9f4e694f-1436-4e0a-88a4-1f4d060c423c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f4e694f-1436-4e0a-88a4-1f4d060c423c
Content-Type: application/json

--- request body ---
{"handle":"qa-6d59bd0edb5e","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f4e694f-1436-4e0a-88a4-1f4d060c423c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_013abe18-e0e5-4e8c-bbe9-750cc84a6a4e"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_e10ee91b-399d-4672-8466-99905cd9b111/messages
correlation: qa-f2144f40-fb77-4728-b7f4-9e5174d0045a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2144f40-fb77-4728-b7f4-9e5174d0045a
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2144f40-fb77-4728-b7f4-9e5174d0045a
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
Content-Length: 203

{"id":"msg_236a45ef-c157-4cdb-9fa3-32587b7b20fd","conversationId":"cnv_e10ee91b-399d-4672-8466-99905cd9b111","sender":"qa-6d59bd0edb5e","body":"Friday works","createdAt":"2026-11-05T09:37:50.587441558Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_e10ee91b-399d-4672-8466-99905cd9b111/messages
correlation: qa-0adbdb3c-a79a-49b3-a6a8-14dbc2980870

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0adbdb3c-a79a-49b3-a6a8-14dbc2980870
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0adbdb3c-a79a-49b3-a6a8-14dbc2980870
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
Content-Length: 432

{"items":[{"id":"msg_55422cee-2982-4ec1-b7db-1ffceb454282","conversationId":"cnv_e10ee91b-399d-4672-8466-99905cd9b111","sender":"qa-86d08b41804e","body":"Free on Friday?","createdAt":"2026-11-05T09:37:50.453214464Z"},{"id":"msg_236a45ef-c157-4cdb-9fa3-32587b7b20fd","conversationId":"cnv_e10ee91b-399d-4672-8466-99905cd9b111","sender":"qa-6d59bd0edb5e","body":"Friday works","createdAt":"2026-11-05T09:37:50.587441558Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b9acdf6-644c-4bcd-a304-70c5ee9bbf19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b9acdf6-644c-4bcd-a304-70c5ee9bbf19
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b9acdf6-644c-4bcd-a304-70c5ee9bbf19
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
correlation: qa-8dfb9068-f9e8-411c-a867-807f98980e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dfb9068-f9e8-411c-a867-807f98980e2b
Content-Type: application/json

--- request body ---
{"handle":"qa-6d59bd0edb5e","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8dfb9068-f9e8-411c-a867-807f98980e2b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8dfb9068-f9e8-411c-a867-807f98980e2b"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81a4f75b-3067-4b27-b411-8795ad42b0b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81a4f75b-3067-4b27-b411-8795ad42b0b6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81a4f75b-3067-4b27-b411-8795ad42b0b6
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
correlation: qa-c4f741c2-a28f-43f8-9e55-df7417bde4a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4f741c2-a28f-43f8-9e55-df7417bde4a4
Content-Type: application/json

--- request body ---
{"handle":"qa-86d08b41804e","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4f741c2-a28f-43f8-9e55-df7417bde4a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4f741c2-a28f-43f8-9e55-df7417bde4a4"}
```
