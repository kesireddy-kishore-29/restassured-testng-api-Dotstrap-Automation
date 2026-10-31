# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-5b7514c4-1c37-4f54-adf5-b06214924991` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-3d5aede8-7966-4354-acab-cfd55f9fd72c` |
| 3 | `POST /v1/accounts` | 201 | 26 | `qa-7d8c4bf4-fb34-447f-ab6e-673a366d6b48` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-515f1f2f-278d-411f-93df-803fb1d6e796` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-0f1a6172-d4ee-4f41-9922-5541e371f737` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-edc9961c-9803-41d5-8a2b-73e7daf5a123` |
| 7 | `GET /v1/conversations/{id}` | 403 | 17 | `qa-05502f6a-ecf2-4778-ac9b-17afabd55700` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 21 | `qa-41ff8ec7-3e21-4839-8c61-d8816f62282d` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 16 | `qa-30472f9a-61f1-4d59-8486-d4ec9d9ef053` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-6acf681b-9242-4e4a-aa3b-b42145605d90` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-2160c265-e045-4b9a-8546-9d78c46c3160` |
| 12 | `POST /v1/auth/token` | 200 | 18 | `qa-577f3a41-f4d4-400d-aa33-b7a339a1743c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-81c5cd17-6df2-4543-86aa-5211900c661b` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-59042c78-b957-4a91-a05f-b1fc55ea2f61` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-48214904-de3f-4d57-87a0-9115b3292cb8` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-d2befc78-c294-4b97-b28f-913fe64827e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b7514c4-1c37-4f54-adf5-b06214924991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b7514c4-1c37-4f54-adf5-b06214924991
Content-Type: application/json

--- request body ---
{"handle":"qa-0b1951b261b1","displayName":"QA 0b1951b261b1","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b7514c4-1c37-4f54-adf5-b06214924991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-0b1951b261b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8701630f-347a-48cb-bdbd-04b99cc1e7f8","handle":"qa-0b1951b261b1","displayName":"QA 0b1951b261b1","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.732836971Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3d5aede8-7966-4354-acab-cfd55f9fd72c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d5aede8-7966-4354-acab-cfd55f9fd72c
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa141d3205e","displayName":"QA bfa141d3205e","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d5aede8-7966-4354-acab-cfd55f9fd72c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-bfa141d3205e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e90710c-17f3-4ce5-a177-58fd15a0fbaf","handle":"qa-bfa141d3205e","displayName":"QA bfa141d3205e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.780788175Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-7d8c4bf4-fb34-447f-ab6e-673a366d6b48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d8c4bf4-fb34-447f-ab6e-673a366d6b48
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee2700ab376","displayName":"QA 7ee2700ab376","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d8c4bf4-fb34-447f-ab6e-673a366d6b48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 8
Location: /v1/accounts/qa-7ee2700ab376
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae4b5d9d-c729-4c51-987c-6047a526044f","handle":"qa-7ee2700ab376","displayName":"QA 7ee2700ab376","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.823948814Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-515f1f2f-278d-411f-93df-803fb1d6e796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-515f1f2f-278d-411f-93df-803fb1d6e796
Content-Type: application/json

--- request body ---
{"handle":"qa-0b1951b261b1","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-515f1f2f-278d-411f-93df-803fb1d6e796
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8701630f-347a-48cb-bdbd-04b99cc1e7f8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0f1a6172-d4ee-4f41-9922-5541e371f737

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f1a6172-d4ee-4f41-9922-5541e371f737
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfa141d3205e","subject":"Private","message":"Just us"}

--- response: 201 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f1a6172-d4ee-4f41-9922-5541e371f737
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
Location: /v1/conversations/cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e","subject":"Private","status":"open","region":"eu","participants":["qa-0b1951b261b1","qa-bfa141d3205e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:30.887708212Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-edc9961c-9803-41d5-8a2b-73e7daf5a123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edc9961c-9803-41d5-8a2b-73e7daf5a123
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee2700ab376","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-edc9961c-9803-41d5-8a2b-73e7daf5a123
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae4b5d9d-c729-4c51-987c-6047a526044f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e
correlation: qa-05502f6a-ecf2-4778-ac9b-17afabd55700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05502f6a-ecf2-4778-ac9b-17afabd55700
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05502f6a-ecf2-4778-ac9b-17afabd55700
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e","correlationId":"qa-05502f6a-ecf2-4778-ac9b-17afabd55700"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e/messages
correlation: qa-41ff8ec7-3e21-4839-8c61-d8816f62282d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41ff8ec7-3e21-4839-8c61-d8816f62282d
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41ff8ec7-3e21-4839-8c61-d8816f62282d
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e/messages","correlationId":"qa-41ff8ec7-3e21-4839-8c61-d8816f62282d"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e/messages
correlation: qa-30472f9a-61f1-4d59-8486-d4ec9d9ef053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30472f9a-61f1-4d59-8486-d4ec9d9ef053
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30472f9a-61f1-4d59-8486-d4ec9d9ef053
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_793764d7-e00e-4dd0-8ece-9620c9f1093e/messages","correlationId":"qa-30472f9a-61f1-4d59-8486-d4ec9d9ef053"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6acf681b-9242-4e4a-aa3b-b42145605d90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acf681b-9242-4e4a-aa3b-b42145605d90
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6acf681b-9242-4e4a-aa3b-b42145605d90
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-2160c265-e045-4b9a-8546-9d78c46c3160

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2160c265-e045-4b9a-8546-9d78c46c3160
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee2700ab376","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2160c265-e045-4b9a-8546-9d78c46c3160
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2160c265-e045-4b9a-8546-9d78c46c3160"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-577f3a41-f4d4-400d-aa33-b7a339a1743c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577f3a41-f4d4-400d-aa33-b7a339a1743c
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa141d3205e","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-577f3a41-f4d4-400d-aa33-b7a339a1743c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e90710c-17f3-4ce5-a177-58fd15a0fbaf"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81c5cd17-6df2-4543-86aa-5211900c661b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81c5cd17-6df2-4543-86aa-5211900c661b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81c5cd17-6df2-4543-86aa-5211900c661b
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-59042c78-b957-4a91-a05f-b1fc55ea2f61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59042c78-b957-4a91-a05f-b1fc55ea2f61
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa141d3205e","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59042c78-b957-4a91-a05f-b1fc55ea2f61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59042c78-b957-4a91-a05f-b1fc55ea2f61"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48214904-de3f-4d57-87a0-9115b3292cb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48214904-de3f-4d57-87a0-9115b3292cb8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48214904-de3f-4d57-87a0-9115b3292cb8
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-d2befc78-c294-4b97-b28f-913fe64827e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2befc78-c294-4b97-b28f-913fe64827e5
Content-Type: application/json

--- request body ---
{"handle":"qa-0b1951b261b1","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2befc78-c294-4b97-b28f-913fe64827e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2befc78-c294-4b97-b28f-913fe64827e5"}
```
