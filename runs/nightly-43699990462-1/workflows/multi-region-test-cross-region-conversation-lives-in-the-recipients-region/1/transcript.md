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
| 1 | `POST /v1/accounts` | 201 | 427 | `qa-cf47a2d4-8c40-4764-a559-48c8e9a54425` |
| 2 | `POST /v1/accounts` | 201 | 117 | `qa-940a7c72-c66b-4b7c-ab09-51ce8f906727` |
| 3 | `POST /v1/auth/token` | 200 | 70 | `qa-bea60e5f-d411-4595-abe6-8223c518ea8a` |
| 4 | `POST /v1/conversations` | 201 | 142 | `qa-bf07c599-e81b-48fe-85f7-53875c6c7fc5` |
| 5 | `GET /v1/conversations/{id}` | 200 | 43 | `qa-db05ee83-11b5-42e8-9aac-d3138d0a554a` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-1b521882-c8e1-44dd-ba51-7df75170c362` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-e004dfe5-74f8-47e7-8d2a-5164b0ca3eef` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-6402250f-5ea7-45e3-893d-00d027159907` |
| 9 | `POST /v1/auth/token` | 401 | 44 | `qa-c77f0246-5551-4008-8b23-029c72ab8a3d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-07eb0f61-dfa0-4f1b-abfa-2fa8768ded31` |
| 11 | `POST /v1/auth/token` | 401 | 29 | `qa-fa1f3911-ca8c-4c64-a063-b067d2353606` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cf47a2d4-8c40-4764-a559-48c8e9a54425

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf47a2d4-8c40-4764-a559-48c8e9a54425
Content-Type: application/json

--- request body ---
{"handle":"qa-44306d622dc8","displayName":"QA 44306d622dc8","password":"****","region":"in"}

--- response: 201 in 427 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf47a2d4-8c40-4764-a559-48c8e9a54425
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-44306d622dc8
X-Served-Region: in
Content-Length: 181

{"id":"acc_ca69fcf2-f6e4-4877-9007-825e514376de","handle":"qa-44306d622dc8","displayName":"QA 44306d622dc8","region":"in","role":"user","createdAt":"2026-11-15T09:36:14.666438143Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-940a7c72-c66b-4b7c-ab09-51ce8f906727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-940a7c72-c66b-4b7c-ab09-51ce8f906727
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee2aee80564","displayName":"QA 1ee2aee80564","password":"****","region":"eu"}

--- response: 201 in 117 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-940a7c72-c66b-4b7c-ab09-51ce8f906727
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
Location: /v1/accounts/qa-1ee2aee80564
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ddfc4274-377e-4b2a-a8d1-3e9c02c84a7b","handle":"qa-1ee2aee80564","displayName":"QA 1ee2aee80564","region":"eu","role":"user","createdAt":"2026-11-15T09:36:15.263231587Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bea60e5f-d411-4595-abe6-8223c518ea8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea60e5f-d411-4595-abe6-8223c518ea8a
Content-Type: application/json

--- request body ---
{"handle":"qa-44306d622dc8","password":"****"}

--- response: 200 in 70 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bea60e5f-d411-4595-abe6-8223c518ea8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca69fcf2-f6e4-4877-9007-825e514376de"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bf07c599-e81b-48fe-85f7-53875c6c7fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf07c599-e81b-48fe-85f7-53875c6c7fc5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ee2aee80564","subject":"Across regions","message":"Namaste"}

--- response: 201 in 142 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf07c599-e81b-48fe-85f7-53875c6c7fc5
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
Location: /v1/conversations/cnv_d5f22ce7-ad0d-4835-96be-403d0341f327
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d5f22ce7-ad0d-4835-96be-403d0341f327","subject":"Across regions","status":"open","region":"eu","participants":["qa-44306d622dc8","qa-1ee2aee80564"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:15.575725040Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_d5f22ce7-ad0d-4835-96be-403d0341f327
correlation: qa-db05ee83-11b5-42e8-9aac-d3138d0a554a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db05ee83-11b5-42e8-9aac-d3138d0a554a
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-db05ee83-11b5-42e8-9aac-d3138d0a554a
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

{"id":"cnv_d5f22ce7-ad0d-4835-96be-403d0341f327","subject":"Across regions","status":"open","region":"eu","participants":["qa-44306d622dc8","qa-1ee2aee80564"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:15.575725040Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1b521882-c8e1-44dd-ba51-7df75170c362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b521882-c8e1-44dd-ba51-7df75170c362
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee2aee80564","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b521882-c8e1-44dd-ba51-7df75170c362
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ddfc4274-377e-4b2a-a8d1-3e9c02c84a7b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_d5f22ce7-ad0d-4835-96be-403d0341f327
correlation: qa-e004dfe5-74f8-47e7-8d2a-5164b0ca3eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e004dfe5-74f8-47e7-8d2a-5164b0ca3eef
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e004dfe5-74f8-47e7-8d2a-5164b0ca3eef
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

{"id":"cnv_d5f22ce7-ad0d-4835-96be-403d0341f327","subject":"Across regions","status":"open","region":"eu","participants":["qa-44306d622dc8","qa-1ee2aee80564"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-15T09:36:15.575725040Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6402250f-5ea7-45e3-893d-00d027159907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6402250f-5ea7-45e3-893d-00d027159907
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6402250f-5ea7-45e3-893d-00d027159907
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
correlation: qa-c77f0246-5551-4008-8b23-029c72ab8a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c77f0246-5551-4008-8b23-029c72ab8a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee2aee80564","password":"****"}

--- response: 401 in 44 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c77f0246-5551-4008-8b23-029c72ab8a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c77f0246-5551-4008-8b23-029c72ab8a3d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07eb0f61-dfa0-4f1b-abfa-2fa8768ded31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07eb0f61-dfa0-4f1b-abfa-2fa8768ded31
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07eb0f61-dfa0-4f1b-abfa-2fa8768ded31
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
correlation: qa-fa1f3911-ca8c-4c64-a063-b067d2353606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa1f3911-ca8c-4c64-a063-b067d2353606
Content-Type: application/json

--- request body ---
{"handle":"qa-44306d622dc8","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa1f3911-ca8c-4c64-a063-b067d2353606
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa1f3911-ca8c-4c64-a063-b067d2353606"}
```
