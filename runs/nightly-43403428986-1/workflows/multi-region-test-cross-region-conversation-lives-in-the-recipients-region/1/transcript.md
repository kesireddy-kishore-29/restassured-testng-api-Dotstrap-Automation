# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 527 | `qa-61ac46d7-f61b-4ff6-a091-dd0ef56d2027` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-fd3befc8-ba58-4f37-a06d-d8d5949d68fb` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-cddcc851-b5d3-43fb-9b2b-6f4fc5a0a586` |
| 4 | `POST /v1/conversations` | 201 | 106 | `qa-1721975c-5a0d-4284-a32a-68d47a7e46cc` |
| 5 | `GET /v1/conversations/{id}` | 200 | 48 | `qa-88dc2509-e969-4802-a843-66384ceed560` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-e9d0071d-6a5e-4797-b0e7-bea660fe3249` |
| 7 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-173523d3-de03-4479-9b53-1113f820b7c9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-75a2b41b-635e-405e-bf86-a0487e877e35` |
| 9 | `POST /v1/auth/token` | 401 | 37 | `qa-e21d7b64-43a2-4422-9df9-b4aabf132759` |
| 10 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-dccd6682-4fba-4f83-a3d8-5e6f29d40817` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-4c25542d-24f8-4a32-8b65-74b018016c14` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61ac46d7-f61b-4ff6-a091-dd0ef56d2027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61ac46d7-f61b-4ff6-a091-dd0ef56d2027
Content-Type: application/json

--- request body ---
{"handle":"qa-3e2ecb8db98b","displayName":"QA 3e2ecb8db98b","password":"****","region":"in"}

--- response: 201 in 527 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-61ac46d7-f61b-4ff6-a091-dd0ef56d2027
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
Location: /v1/accounts/qa-3e2ecb8db98b
X-Served-Region: in
Content-Length: 181

{"id":"acc_3fc7f2bb-e00f-4baf-8ce3-415011e9d145","handle":"qa-3e2ecb8db98b","displayName":"QA 3e2ecb8db98b","region":"in","role":"user","createdAt":"2026-11-13T09:42:11.314479567Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fd3befc8-ba58-4f37-a06d-d8d5949d68fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd3befc8-ba58-4f37-a06d-d8d5949d68fb
Content-Type: application/json

--- request body ---
{"handle":"qa-2821c9f22866","displayName":"QA 2821c9f22866","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd3befc8-ba58-4f37-a06d-d8d5949d68fb
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
Location: /v1/accounts/qa-2821c9f22866
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3aa6122-953f-43cd-849b-7a384a0fc1e7","handle":"qa-2821c9f22866","displayName":"QA 2821c9f22866","region":"eu","role":"user","createdAt":"2026-11-13T09:42:11.803166692Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cddcc851-b5d3-43fb-9b2b-6f4fc5a0a586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cddcc851-b5d3-43fb-9b2b-6f4fc5a0a586
Content-Type: application/json

--- request body ---
{"handle":"qa-3e2ecb8db98b","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-cddcc851-b5d3-43fb-9b2b-6f4fc5a0a586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3fc7f2bb-e00f-4baf-8ce3-415011e9d145"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1721975c-5a0d-4284-a32a-68d47a7e46cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1721975c-5a0d-4284-a32a-68d47a7e46cc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2821c9f22866","subject":"Across regions","message":"Namaste"}

--- response: 201 in 106 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1721975c-5a0d-4284-a32a-68d47a7e46cc
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
X-Served-Region: in
Location: /v1/conversations/cnv_95f76cb1-b66a-4756-aa8b-668ead166ddf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_95f76cb1-b66a-4756-aa8b-668ead166ddf","subject":"Across regions","status":"open","region":"eu","participants":["qa-3e2ecb8db98b","qa-2821c9f22866"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:12.051028500Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_95f76cb1-b66a-4756-aa8b-668ead166ddf
correlation: qa-88dc2509-e969-4802-a843-66384ceed560

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88dc2509-e969-4802-a843-66384ceed560
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-88dc2509-e969-4802-a843-66384ceed560
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_95f76cb1-b66a-4756-aa8b-668ead166ddf","subject":"Across regions","status":"open","region":"eu","participants":["qa-3e2ecb8db98b","qa-2821c9f22866"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:12.051028500Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e9d0071d-6a5e-4797-b0e7-bea660fe3249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9d0071d-6a5e-4797-b0e7-bea660fe3249
Content-Type: application/json

--- request body ---
{"handle":"qa-2821c9f22866","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9d0071d-6a5e-4797-b0e7-bea660fe3249
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3aa6122-953f-43cd-849b-7a384a0fc1e7"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_95f76cb1-b66a-4756-aa8b-668ead166ddf
correlation: qa-173523d3-de03-4479-9b53-1113f820b7c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-173523d3-de03-4479-9b53-1113f820b7c9
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-173523d3-de03-4479-9b53-1113f820b7c9
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
Content-Length: 237

{"id":"cnv_95f76cb1-b66a-4756-aa8b-668ead166ddf","subject":"Across regions","status":"open","region":"eu","participants":["qa-3e2ecb8db98b","qa-2821c9f22866"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-13T09:42:12.051028500Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-75a2b41b-635e-405e-bf86-a0487e877e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a2b41b-635e-405e-bf86-a0487e877e35
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-75a2b41b-635e-405e-bf86-a0487e877e35
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
correlation: qa-e21d7b64-43a2-4422-9df9-b4aabf132759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e21d7b64-43a2-4422-9df9-b4aabf132759
Content-Type: application/json

--- request body ---
{"handle":"qa-2821c9f22866","password":"****"}

--- response: 401 in 37 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e21d7b64-43a2-4422-9df9-b4aabf132759
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e21d7b64-43a2-4422-9df9-b4aabf132759"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dccd6682-4fba-4f83-a3d8-5e6f29d40817

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dccd6682-4fba-4f83-a3d8-5e6f29d40817
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dccd6682-4fba-4f83-a3d8-5e6f29d40817
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-4c25542d-24f8-4a32-8b65-74b018016c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c25542d-24f8-4a32-8b65-74b018016c14
Content-Type: application/json

--- request body ---
{"handle":"qa-3e2ecb8db98b","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c25542d-24f8-4a32-8b65-74b018016c14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c25542d-24f8-4a32-8b65-74b018016c14"}
```
