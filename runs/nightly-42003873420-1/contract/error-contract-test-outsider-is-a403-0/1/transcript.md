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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-7a295290-f229-40c9-91ab-0ce099d9a6a9` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-433e73a8-7793-4eb7-af4f-a2a5a4c683b6` |
| 3 | `POST /v1/accounts` | 201 | 30 | `qa-c86deb02-23f0-4375-8b01-7f6d7797ad8f` |
| 4 | `POST /v1/auth/token` | 200 | 29 | `qa-46c39701-700c-4621-8756-4cd1bbda0c63` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-48a1b01b-b6fe-4761-b315-d7673473aa5c` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-f3a6bbfd-aa69-4a05-abfc-6523ef5fe65a` |
| 7 | `GET /v1/conversations/{id}` | 403 | 16 | `qa-5764d76b-61bb-4176-b85c-36d7cf55e197` |
| 8 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-4f6bf7f8-fa10-4c28-aaee-fb987cbbcbc8` |
| 9 | `POST /v1/auth/token` | 401 | 27 | `qa-ce8255f8-4604-46e9-891b-3f148f197036` |
| 10 | `POST /v1/auth/token` | 200 | 30 | `qa-3d0ae9b1-749a-425f-afcd-deeec7cb0595` |
| 11 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-a4bcf980-a14a-487d-8019-dfceafc4f503` |
| 12 | `POST /v1/auth/token` | 401 | 44 | `qa-f8a9bac7-9190-475c-979d-2f279cc1c6e1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-698c9033-9795-415f-9fb9-f68c5665654c` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-2fed80a5-df90-44f8-9596-133316193d4d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7a295290-f229-40c9-91ab-0ce099d9a6a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a295290-f229-40c9-91ab-0ce099d9a6a9
Content-Type: application/json

--- request body ---
{"handle":"qa-e7b3f6490e8a","displayName":"QA e7b3f6490e8a","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a295290-f229-40c9-91ab-0ce099d9a6a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-e7b3f6490e8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_febcc564-5807-4b83-8cbd-f26999af0acc","handle":"qa-e7b3f6490e8a","displayName":"QA e7b3f6490e8a","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.074361866Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-433e73a8-7793-4eb7-af4f-a2a5a4c683b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-433e73a8-7793-4eb7-af4f-a2a5a4c683b6
Content-Type: application/json

--- request body ---
{"handle":"qa-23bb4cb2633a","displayName":"QA 23bb4cb2633a","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-433e73a8-7793-4eb7-af4f-a2a5a4c683b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-23bb4cb2633a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_58803e93-0435-415f-80b6-6a0d3308b30c","handle":"qa-23bb4cb2633a","displayName":"QA 23bb4cb2633a","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.114616175Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c86deb02-23f0-4375-8b01-7f6d7797ad8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86deb02-23f0-4375-8b01-7f6d7797ad8f
Content-Type: application/json

--- request body ---
{"handle":"qa-f46d8684b367","displayName":"QA f46d8684b367","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c86deb02-23f0-4375-8b01-7f6d7797ad8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-f46d8684b367
X-Served-Region: eu
Content-Length: 181

{"id":"acc_233c4a4b-2aef-4157-8c13-0611cd99b653","handle":"qa-f46d8684b367","displayName":"QA f46d8684b367","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.154949830Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-46c39701-700c-4621-8756-4cd1bbda0c63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46c39701-700c-4621-8756-4cd1bbda0c63
Content-Type: application/json

--- request body ---
{"handle":"qa-e7b3f6490e8a","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-46c39701-700c-4621-8756-4cd1bbda0c63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_febcc564-5807-4b83-8cbd-f26999af0acc"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-48a1b01b-b6fe-4761-b315-d7673473aa5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a1b01b-b6fe-4761-b315-d7673473aa5c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-23bb4cb2633a","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-48a1b01b-b6fe-4761-b315-d7673473aa5c
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
Location: /v1/conversations/cnv_b5827583-8cd9-425e-af71-2dbc712fe04b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b5827583-8cd9-425e-af71-2dbc712fe04b","subject":"Error contract","status":"open","region":"eu","participants":["qa-e7b3f6490e8a","qa-23bb4cb2633a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:54.232225551Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f3a6bbfd-aa69-4a05-abfc-6523ef5fe65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3a6bbfd-aa69-4a05-abfc-6523ef5fe65a
Content-Type: application/json

--- request body ---
{"handle":"qa-f46d8684b367","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3a6bbfd-aa69-4a05-abfc-6523ef5fe65a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_233c4a4b-2aef-4157-8c13-0611cd99b653"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b5827583-8cd9-425e-af71-2dbc712fe04b
correlation: qa-5764d76b-61bb-4176-b85c-36d7cf55e197

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5764d76b-61bb-4176-b85c-36d7cf55e197
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5764d76b-61bb-4176-b85c-36d7cf55e197
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b5827583-8cd9-425e-af71-2dbc712fe04b","correlationId":"qa-5764d76b-61bb-4176-b85c-36d7cf55e197"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f6bf7f8-fa10-4c28-aaee-fb987cbbcbc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f6bf7f8-fa10-4c28-aaee-fb987cbbcbc8
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f6bf7f8-fa10-4c28-aaee-fb987cbbcbc8
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
correlation: qa-ce8255f8-4604-46e9-891b-3f148f197036

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8255f8-4604-46e9-891b-3f148f197036
Content-Type: application/json

--- request body ---
{"handle":"qa-f46d8684b367","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce8255f8-4604-46e9-891b-3f148f197036
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce8255f8-4604-46e9-891b-3f148f197036"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3d0ae9b1-749a-425f-afcd-deeec7cb0595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d0ae9b1-749a-425f-afcd-deeec7cb0595
Content-Type: application/json

--- request body ---
{"handle":"qa-23bb4cb2633a","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d0ae9b1-749a-425f-afcd-deeec7cb0595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58803e93-0435-415f-80b6-6a0d3308b30c"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4bcf980-a14a-487d-8019-dfceafc4f503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4bcf980-a14a-487d-8019-dfceafc4f503
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4bcf980-a14a-487d-8019-dfceafc4f503
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
correlation: qa-f8a9bac7-9190-475c-979d-2f279cc1c6e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8a9bac7-9190-475c-979d-2f279cc1c6e1
Content-Type: application/json

--- request body ---
{"handle":"qa-23bb4cb2633a","password":"****"}

--- response: 401 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8a9bac7-9190-475c-979d-2f279cc1c6e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8a9bac7-9190-475c-979d-2f279cc1c6e1"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-698c9033-9795-415f-9fb9-f68c5665654c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-698c9033-9795-415f-9fb9-f68c5665654c
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-698c9033-9795-415f-9fb9-f68c5665654c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-2fed80a5-df90-44f8-9596-133316193d4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fed80a5-df90-44f8-9596-133316193d4d
Content-Type: application/json

--- request body ---
{"handle":"qa-e7b3f6490e8a","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fed80a5-df90-44f8-9596-133316193d4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fed80a5-df90-44f8-9596-133316193d4d"}
```
