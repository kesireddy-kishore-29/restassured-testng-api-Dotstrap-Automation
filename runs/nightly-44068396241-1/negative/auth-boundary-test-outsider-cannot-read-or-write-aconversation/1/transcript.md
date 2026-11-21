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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-2118b13a-b858-4887-9729-5dbf8121d28f` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-f3ef41c6-8847-4ee0-8000-23dcef4f0452` |
| 3 | `POST /v1/accounts` | 201 | 35 | `qa-f23db72b-48f4-4f30-ab18-b7040bc05640` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-39065fa7-da4f-4030-9cd9-5af88cb14a67` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-3819967b-c631-4141-a878-0bcc030e2e65` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-e73d8a4f-0056-43c1-91dc-542c971b4d6e` |
| 7 | `GET /v1/conversations/{id}` | 403 | 9 | `qa-85edb17b-2077-4e8b-b4ef-0d2bdfcd6759` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-f80d2ec8-7332-4933-97c9-60c1a51437a9` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-18091c1a-907b-4537-ad24-1a580a9b400f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4e735786-b5a0-494d-8b06-379eaeb4eea7` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-22824872-5224-4fe7-ae0c-33b6f3fb9dfa` |
| 12 | `POST /v1/auth/token` | 200 | 13 | `qa-d98091aa-129d-461f-9bf2-2af6a91b98bd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0c350634-c060-452c-89e5-40f7c2d2fefa` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-3e0a5f06-aa42-4a5c-9160-d8919459c0f6` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-faa3979f-edfb-40f5-89ba-6238f8b57ce9` |
| 16 | `POST /v1/auth/token` | 401 | 10 | `qa-9a565b64-cf93-4430-9e52-a4370421349a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2118b13a-b858-4887-9729-5dbf8121d28f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2118b13a-b858-4887-9729-5dbf8121d28f
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2d58c7fb58","displayName":"QA 9d2d58c7fb58","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2118b13a-b858-4887-9729-5dbf8121d28f
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
Location: /v1/accounts/qa-9d2d58c7fb58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1540fafe-eb25-4419-84b3-406926dc8fc0","handle":"qa-9d2d58c7fb58","displayName":"QA 9d2d58c7fb58","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.659521738Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f3ef41c6-8847-4ee0-8000-23dcef4f0452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ef41c6-8847-4ee0-8000-23dcef4f0452
Content-Type: application/json

--- request body ---
{"handle":"qa-2126713c57c3","displayName":"QA 2126713c57c3","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3ef41c6-8847-4ee0-8000-23dcef4f0452
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-2126713c57c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c54c1b6-4e1c-4786-85ff-aec6f42d88ce","handle":"qa-2126713c57c3","displayName":"QA 2126713c57c3","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.686624356Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f23db72b-48f4-4f30-ab18-b7040bc05640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f23db72b-48f4-4f30-ab18-b7040bc05640
Content-Type: application/json

--- request body ---
{"handle":"qa-72989789f332","displayName":"QA 72989789f332","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f23db72b-48f4-4f30-ab18-b7040bc05640
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
Location: /v1/accounts/qa-72989789f332
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47b3d087-d788-428b-ba5c-303791892a2f","handle":"qa-72989789f332","displayName":"QA 72989789f332","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.735543847Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-39065fa7-da4f-4030-9cd9-5af88cb14a67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39065fa7-da4f-4030-9cd9-5af88cb14a67
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2d58c7fb58","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-39065fa7-da4f-4030-9cd9-5af88cb14a67
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1540fafe-eb25-4419-84b3-406926dc8fc0"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3819967b-c631-4141-a878-0bcc030e2e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3819967b-c631-4141-a878-0bcc030e2e65
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2126713c57c3","subject":"Private","message":"Just us"}

--- response: 201 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3819967b-c631-4141-a878-0bcc030e2e65
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
Location: /v1/conversations/cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118","subject":"Private","status":"open","region":"eu","participants":["qa-9d2d58c7fb58","qa-2126713c57c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:11.787821837Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e73d8a4f-0056-43c1-91dc-542c971b4d6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e73d8a4f-0056-43c1-91dc-542c971b4d6e
Content-Type: application/json

--- request body ---
{"handle":"qa-72989789f332","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e73d8a4f-0056-43c1-91dc-542c971b4d6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47b3d087-d788-428b-ba5c-303791892a2f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118
correlation: qa-85edb17b-2077-4e8b-b4ef-0d2bdfcd6759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85edb17b-2077-4e8b-b4ef-0d2bdfcd6759
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85edb17b-2077-4e8b-b4ef-0d2bdfcd6759
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118","correlationId":"qa-85edb17b-2077-4e8b-b4ef-0d2bdfcd6759"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118/messages
correlation: qa-f80d2ec8-7332-4933-97c9-60c1a51437a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f80d2ec8-7332-4933-97c9-60c1a51437a9
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f80d2ec8-7332-4933-97c9-60c1a51437a9
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118/messages","correlationId":"qa-f80d2ec8-7332-4933-97c9-60c1a51437a9"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118/messages
correlation: qa-18091c1a-907b-4537-ad24-1a580a9b400f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18091c1a-907b-4537-ad24-1a580a9b400f
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18091c1a-907b-4537-ad24-1a580a9b400f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9339ae8f-df03-4f8c-bf03-ae0699db7118/messages","correlationId":"qa-18091c1a-907b-4537-ad24-1a580a9b400f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e735786-b5a0-494d-8b06-379eaeb4eea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e735786-b5a0-494d-8b06-379eaeb4eea7
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e735786-b5a0-494d-8b06-379eaeb4eea7
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
correlation: qa-22824872-5224-4fe7-ae0c-33b6f3fb9dfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22824872-5224-4fe7-ae0c-33b6f3fb9dfa
Content-Type: application/json

--- request body ---
{"handle":"qa-72989789f332","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22824872-5224-4fe7-ae0c-33b6f3fb9dfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22824872-5224-4fe7-ae0c-33b6f3fb9dfa"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d98091aa-129d-461f-9bf2-2af6a91b98bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d98091aa-129d-461f-9bf2-2af6a91b98bd
Content-Type: application/json

--- request body ---
{"handle":"qa-2126713c57c3","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d98091aa-129d-461f-9bf2-2af6a91b98bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c54c1b6-4e1c-4786-85ff-aec6f42d88ce"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c350634-c060-452c-89e5-40f7c2d2fefa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c350634-c060-452c-89e5-40f7c2d2fefa
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c350634-c060-452c-89e5-40f7c2d2fefa
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
correlation: qa-3e0a5f06-aa42-4a5c-9160-d8919459c0f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e0a5f06-aa42-4a5c-9160-d8919459c0f6
Content-Type: application/json

--- request body ---
{"handle":"qa-2126713c57c3","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e0a5f06-aa42-4a5c-9160-d8919459c0f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e0a5f06-aa42-4a5c-9160-d8919459c0f6"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-faa3979f-edfb-40f5-89ba-6238f8b57ce9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faa3979f-edfb-40f5-89ba-6238f8b57ce9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-faa3979f-edfb-40f5-89ba-6238f8b57ce9
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
correlation: qa-9a565b64-cf93-4430-9e52-a4370421349a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a565b64-cf93-4430-9e52-a4370421349a
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2d58c7fb58","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a565b64-cf93-4430-9e52-a4370421349a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a565b64-cf93-4430-9e52-a4370421349a"}
```
