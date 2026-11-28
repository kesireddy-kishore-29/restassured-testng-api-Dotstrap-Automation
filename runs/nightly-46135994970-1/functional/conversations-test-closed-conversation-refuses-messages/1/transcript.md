# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 414 | `qa-6a0669f1-b175-43cb-ab41-b723709a9017` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-d9463219-54ed-473b-9d76-38627e1d4e89` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-cedaf3f1-1f42-4f73-9119-e7883a1f837e` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-820b3904-e7c7-4291-947a-411eb0b63267` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 54 | `qa-7f356439-60dd-4c77-acd4-818eff7c54c4` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-d005e87c-8b49-4ee5-b90f-f3ca88f93dec` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 9 | `qa-dd884da8-698d-4c83-bc52-693896654ac0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-3f4f734c-70c4-426b-83aa-50c93e365cc7` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-56a79231-2dd5-4790-8b95-140630a600dd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9e5fb593-9204-46be-bea0-3e939cbdb642` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-1b8dcae1-1236-4406-baac-7a33ddbeaeda` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6a0669f1-b175-43cb-ab41-b723709a9017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a0669f1-b175-43cb-ab41-b723709a9017
Content-Type: application/json

--- request body ---
{"handle":"qa-f3c7b7495c72","displayName":"QA f3c7b7495c72","password":"****","region":"eu"}

--- response: 201 in 414 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a0669f1-b175-43cb-ab41-b723709a9017
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
Location: /v1/accounts/qa-f3c7b7495c72
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b16db68-945b-48c4-a038-e7e8aa9ff493","handle":"qa-f3c7b7495c72","displayName":"QA f3c7b7495c72","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.304375969Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9463219-54ed-473b-9d76-38627e1d4e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9463219-54ed-473b-9d76-38627e1d4e89
Content-Type: application/json

--- request body ---
{"handle":"qa-a48749860ada","displayName":"QA a48749860ada","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9463219-54ed-473b-9d76-38627e1d4e89
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
Location: /v1/accounts/qa-a48749860ada
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e295819-805b-4285-89cb-b47eb2085bc1","handle":"qa-a48749860ada","displayName":"QA a48749860ada","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.614673409Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cedaf3f1-1f42-4f73-9119-e7883a1f837e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cedaf3f1-1f42-4f73-9119-e7883a1f837e
Content-Type: application/json

--- request body ---
{"handle":"qa-f3c7b7495c72","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-cedaf3f1-1f42-4f73-9119-e7883a1f837e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b16db68-945b-48c4-a038-e7e8aa9ff493"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-820b3904-e7c7-4291-947a-411eb0b63267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-820b3904-e7c7-4291-947a-411eb0b63267
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a48749860ada","subject":"Quick question","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-820b3904-e7c7-4291-947a-411eb0b63267
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
Location: /v1/conversations/cnv_37980788-455b-4674-aa53-218eb721f7db
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_37980788-455b-4674-aa53-218eb721f7db","subject":"Quick question","status":"open","region":"eu","participants":["qa-f3c7b7495c72","qa-a48749860ada"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:14.721033694Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_37980788-455b-4674-aa53-218eb721f7db/close
correlation: qa-7f356439-60dd-4c77-acd4-818eff7c54c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f356439-60dd-4c77-acd4-818eff7c54c4
Content-Type: application/json

--- response: 200 in 54 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f356439-60dd-4c77-acd4-818eff7c54c4
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
Content-Length: 283

{"id":"cnv_37980788-455b-4674-aa53-218eb721f7db","subject":"Quick question","status":"closed","region":"eu","participants":["qa-f3c7b7495c72","qa-a48749860ada"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:14.721033694Z","closedAt":"2026-11-28T10:37:14.850891665Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d005e87c-8b49-4ee5-b90f-f3ca88f93dec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d005e87c-8b49-4ee5-b90f-f3ca88f93dec
Content-Type: application/json

--- request body ---
{"handle":"qa-a48749860ada","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d005e87c-8b49-4ee5-b90f-f3ca88f93dec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e295819-805b-4285-89cb-b47eb2085bc1"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_37980788-455b-4674-aa53-218eb721f7db/messages
correlation: qa-dd884da8-698d-4c83-bc52-693896654ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd884da8-698d-4c83-bc52-693896654ac0
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd884da8-698d-4c83-bc52-693896654ac0
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
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_37980788-455b-4674-aa53-218eb721f7db/messages","correlationId":"qa-dd884da8-698d-4c83-bc52-693896654ac0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f4f734c-70c4-426b-83aa-50c93e365cc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f4f734c-70c4-426b-83aa-50c93e365cc7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f4f734c-70c4-426b-83aa-50c93e365cc7
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
correlation: qa-56a79231-2dd5-4790-8b95-140630a600dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56a79231-2dd5-4790-8b95-140630a600dd
Content-Type: application/json

--- request body ---
{"handle":"qa-a48749860ada","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56a79231-2dd5-4790-8b95-140630a600dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56a79231-2dd5-4790-8b95-140630a600dd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9e5fb593-9204-46be-bea0-3e939cbdb642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e5fb593-9204-46be-bea0-3e939cbdb642
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9e5fb593-9204-46be-bea0-3e939cbdb642
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-1b8dcae1-1236-4406-baac-7a33ddbeaeda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b8dcae1-1236-4406-baac-7a33ddbeaeda
Content-Type: application/json

--- request body ---
{"handle":"qa-f3c7b7495c72","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b8dcae1-1236-4406-baac-7a33ddbeaeda
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b8dcae1-1236-4406-baac-7a33ddbeaeda"}
```
