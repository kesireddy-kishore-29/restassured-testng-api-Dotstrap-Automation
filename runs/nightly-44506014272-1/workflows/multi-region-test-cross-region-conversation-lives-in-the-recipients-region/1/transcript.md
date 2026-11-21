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
| 1 | `POST /v1/accounts` | 201 | 493 | `qa-48a91dd0-af51-4785-a6be-87197391d8cb` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-8c2eaab4-e97b-433b-b721-e71e3f334662` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-4e99b494-4f86-4dee-aa7e-8c85723b612a` |
| 4 | `POST /v1/conversations` | 201 | 112 | `qa-3fb57755-2a1d-4d78-8c2c-8d99aeddf009` |
| 5 | `GET /v1/conversations/{id}` | 200 | 41 | `qa-71f4bf22-5be8-47b4-95a6-48597972f5a2` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-e8b8e098-c0a2-41ce-a06a-bdc58c1416f0` |
| 7 | `GET /v1/conversations/{id}` | 200 | 27 | `qa-802afb94-82a9-44e0-b8bb-d0e0c463626a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-900747c1-9c7c-4b18-b068-905c204c1508` |
| 9 | `POST /v1/auth/token` | 401 | 20 | `qa-c5f0f0d2-88a2-47b7-ba28-5f742e33b4fe` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-3d48bf74-1310-4280-a149-3759b869d518` |
| 11 | `POST /v1/auth/token` | 401 | 22 | `qa-76fa782f-cec2-4ef8-ad44-c9d07edfb623` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48a91dd0-af51-4785-a6be-87197391d8cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a91dd0-af51-4785-a6be-87197391d8cb
Content-Type: application/json

--- request body ---
{"handle":"qa-85d85c862011","displayName":"QA 85d85c862011","password":"****","region":"in"}

--- response: 201 in 493 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-48a91dd0-af51-4785-a6be-87197391d8cb
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
Location: /v1/accounts/qa-85d85c862011
X-Served-Region: in
Content-Length: 181

{"id":"acc_af685d6b-5fc9-4988-91f0-b2b3149882c1","handle":"qa-85d85c862011","displayName":"QA 85d85c862011","region":"in","role":"user","createdAt":"2026-11-19T10:29:44.345491669Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8c2eaab4-e97b-433b-b721-e71e3f334662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2eaab4-e97b-433b-b721-e71e3f334662
Content-Type: application/json

--- request body ---
{"handle":"qa-bb26c1527714","displayName":"QA bb26c1527714","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2eaab4-e97b-433b-b721-e71e3f334662
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-bb26c1527714
X-Served-Region: eu
Content-Length: 181

{"id":"acc_359176c2-e714-489c-8732-c00f3a0d8c52","handle":"qa-bb26c1527714","displayName":"QA bb26c1527714","region":"eu","role":"user","createdAt":"2026-11-19T10:29:44.920137487Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4e99b494-4f86-4dee-aa7e-8c85723b612a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e99b494-4f86-4dee-aa7e-8c85723b612a
Content-Type: application/json

--- request body ---
{"handle":"qa-85d85c862011","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e99b494-4f86-4dee-aa7e-8c85723b612a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af685d6b-5fc9-4988-91f0-b2b3149882c1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3fb57755-2a1d-4d78-8c2c-8d99aeddf009

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fb57755-2a1d-4d78-8c2c-8d99aeddf009
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bb26c1527714","subject":"Across regions","message":"Namaste"}

--- response: 201 in 112 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fb57755-2a1d-4d78-8c2c-8d99aeddf009
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
Location: /v1/conversations/cnv_c06d5d4d-63b0-4a72-8a6b-63fa7e91137b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c06d5d4d-63b0-4a72-8a6b-63fa7e91137b","subject":"Across regions","status":"open","region":"eu","participants":["qa-85d85c862011","qa-bb26c1527714"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:45.108881399Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_c06d5d4d-63b0-4a72-8a6b-63fa7e91137b
correlation: qa-71f4bf22-5be8-47b4-95a6-48597972f5a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f4bf22-5be8-47b4-95a6-48597972f5a2
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-71f4bf22-5be8-47b4-95a6-48597972f5a2
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

{"id":"cnv_c06d5d4d-63b0-4a72-8a6b-63fa7e91137b","subject":"Across regions","status":"open","region":"eu","participants":["qa-85d85c862011","qa-bb26c1527714"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:45.108881399Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e8b8e098-c0a2-41ce-a06a-bdc58c1416f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8b8e098-c0a2-41ce-a06a-bdc58c1416f0
Content-Type: application/json

--- request body ---
{"handle":"qa-bb26c1527714","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8b8e098-c0a2-41ce-a06a-bdc58c1416f0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_359176c2-e714-489c-8732-c00f3a0d8c52"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c06d5d4d-63b0-4a72-8a6b-63fa7e91137b
correlation: qa-802afb94-82a9-44e0-b8bb-d0e0c463626a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-802afb94-82a9-44e0-b8bb-d0e0c463626a
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-802afb94-82a9-44e0-b8bb-d0e0c463626a
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

{"id":"cnv_c06d5d4d-63b0-4a72-8a6b-63fa7e91137b","subject":"Across regions","status":"open","region":"eu","participants":["qa-85d85c862011","qa-bb26c1527714"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-19T10:29:45.108881399Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-900747c1-9c7c-4b18-b068-905c204c1508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900747c1-9c7c-4b18-b068-905c204c1508
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-900747c1-9c7c-4b18-b068-905c204c1508
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
correlation: qa-c5f0f0d2-88a2-47b7-ba28-5f742e33b4fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5f0f0d2-88a2-47b7-ba28-5f742e33b4fe
Content-Type: application/json

--- request body ---
{"handle":"qa-bb26c1527714","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5f0f0d2-88a2-47b7-ba28-5f742e33b4fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5f0f0d2-88a2-47b7-ba28-5f742e33b4fe"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d48bf74-1310-4280-a149-3759b869d518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d48bf74-1310-4280-a149-3759b869d518
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d48bf74-1310-4280-a149-3759b869d518
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
correlation: qa-76fa782f-cec2-4ef8-ad44-c9d07edfb623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76fa782f-cec2-4ef8-ad44-c9d07edfb623
Content-Type: application/json

--- request body ---
{"handle":"qa-85d85c862011","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76fa782f-cec2-4ef8-ad44-c9d07edfb623
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76fa782f-cec2-4ef8-ad44-c9d07edfb623"}
```
