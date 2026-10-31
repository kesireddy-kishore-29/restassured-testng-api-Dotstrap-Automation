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
| 1 | `POST /v1/accounts` | 201 | 332 | `qa-3d3ec4a6-b581-43e9-8845-cfd57a1bce78` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-badacd81-f168-429a-80c7-8807f5b44ae4` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-e98ff167-ee75-4a55-b04e-3915bf08f3cc` |
| 4 | `POST /v1/conversations` | 201 | 63 | `qa-c5fc75f3-b50d-4a6b-9942-9c801051d8fc` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-d505de36-e50d-41e8-888c-bef46a5dedf4` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-c1f3cbc9-fc2f-4094-9127-5ba60054b82b` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 21 | `qa-8da2070a-d290-45b3-9c86-a60bd4f673dd` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-b867f87e-87e9-44c3-812b-5251d85b2272` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-0e9554fa-7da2-45f3-a2e8-deab6bfbb2de` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e6daf8ba-a50a-43a0-8962-10d8427b6164` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-546a3d54-0cb4-4d38-af73-d38ce10288a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d3ec4a6-b581-43e9-8845-cfd57a1bce78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d3ec4a6-b581-43e9-8845-cfd57a1bce78
Content-Type: application/json

--- request body ---
{"handle":"qa-0ea05d049911","displayName":"QA 0ea05d049911","password":"****","region":"eu"}

--- response: 201 in 332 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d3ec4a6-b581-43e9-8845-cfd57a1bce78
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
Location: /v1/accounts/qa-0ea05d049911
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8885bb41-be22-4b83-92cd-7dd5fcad5cb3","handle":"qa-0ea05d049911","displayName":"QA 0ea05d049911","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.326432013Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-badacd81-f168-429a-80c7-8807f5b44ae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-badacd81-f168-429a-80c7-8807f5b44ae4
Content-Type: application/json

--- request body ---
{"handle":"qa-09415eb5f3e2","displayName":"QA 09415eb5f3e2","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-badacd81-f168-429a-80c7-8807f5b44ae4
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
Location: /v1/accounts/qa-09415eb5f3e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3285ecdb-27dc-48e4-a9dd-4215ac8fc358","handle":"qa-09415eb5f3e2","displayName":"QA 09415eb5f3e2","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.642136419Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e98ff167-ee75-4a55-b04e-3915bf08f3cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98ff167-ee75-4a55-b04e-3915bf08f3cc
Content-Type: application/json

--- request body ---
{"handle":"qa-0ea05d049911","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e98ff167-ee75-4a55-b04e-3915bf08f3cc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8885bb41-be22-4b83-92cd-7dd5fcad5cb3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c5fc75f3-b50d-4a6b-9942-9c801051d8fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5fc75f3-b50d-4a6b-9942-9c801051d8fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-09415eb5f3e2","subject":"Quick question","message":"Hi"}

--- response: 201 in 63 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5fc75f3-b50d-4a6b-9942-9c801051d8fc
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
Location: /v1/conversations/cnv_d76d7585-9deb-4401-9708-025cbcf92d10
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d76d7585-9deb-4401-9708-025cbcf92d10","subject":"Quick question","status":"open","region":"eu","participants":["qa-0ea05d049911","qa-09415eb5f3e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.756616578Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d76d7585-9deb-4401-9708-025cbcf92d10/close
correlation: qa-d505de36-e50d-41e8-888c-bef46a5dedf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d505de36-e50d-41e8-888c-bef46a5dedf4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d505de36-e50d-41e8-888c-bef46a5dedf4
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

{"id":"cnv_d76d7585-9deb-4401-9708-025cbcf92d10","subject":"Quick question","status":"closed","region":"eu","participants":["qa-0ea05d049911","qa-09415eb5f3e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.756616578Z","closedAt":"2026-10-28T08:42:52.843550722Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c1f3cbc9-fc2f-4094-9127-5ba60054b82b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1f3cbc9-fc2f-4094-9127-5ba60054b82b
Content-Type: application/json

--- request body ---
{"handle":"qa-09415eb5f3e2","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1f3cbc9-fc2f-4094-9127-5ba60054b82b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3285ecdb-27dc-48e4-a9dd-4215ac8fc358"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d76d7585-9deb-4401-9708-025cbcf92d10/messages
correlation: qa-8da2070a-d290-45b3-9c86-a60bd4f673dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8da2070a-d290-45b3-9c86-a60bd4f673dd
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8da2070a-d290-45b3-9c86-a60bd4f673dd
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_d76d7585-9deb-4401-9708-025cbcf92d10/messages","correlationId":"qa-8da2070a-d290-45b3-9c86-a60bd4f673dd"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b867f87e-87e9-44c3-812b-5251d85b2272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b867f87e-87e9-44c3-812b-5251d85b2272
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b867f87e-87e9-44c3-812b-5251d85b2272
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
correlation: qa-0e9554fa-7da2-45f3-a2e8-deab6bfbb2de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e9554fa-7da2-45f3-a2e8-deab6bfbb2de
Content-Type: application/json

--- request body ---
{"handle":"qa-09415eb5f3e2","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e9554fa-7da2-45f3-a2e8-deab6bfbb2de
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e9554fa-7da2-45f3-a2e8-deab6bfbb2de"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6daf8ba-a50a-43a0-8962-10d8427b6164

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6daf8ba-a50a-43a0-8962-10d8427b6164
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6daf8ba-a50a-43a0-8962-10d8427b6164
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
correlation: qa-546a3d54-0cb4-4d38-af73-d38ce10288a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-546a3d54-0cb4-4d38-af73-d38ce10288a3
Content-Type: application/json

--- request body ---
{"handle":"qa-0ea05d049911","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-546a3d54-0cb4-4d38-af73-d38ce10288a3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-546a3d54-0cb4-4d38-af73-d38ce10288a3"}
```
