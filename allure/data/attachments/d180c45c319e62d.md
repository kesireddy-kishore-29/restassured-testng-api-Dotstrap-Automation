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
| 1 | `POST /v1/accounts` | 201 | 344 | `qa-9ae87999-27d0-4a67-8253-6abec27eecb9` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-da7af3b8-a6d6-44ed-bc76-75b1a5f71349` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-3b627a05-0195-4fac-aeff-0cc7710cf57c` |
| 4 | `POST /v1/conversations` | 201 | 76 | `qa-6cd86aef-22fc-498a-8249-9484758940aa` |
| 5 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-1daa564b-9bc9-420d-a1c5-94238bc77939` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-afcef544-6842-4677-82ce-39b0feabf6d9` |
| 7 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-53d49a43-e2da-4eca-af7c-48a66ecfdb3a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-48d501f8-a187-410a-b7a4-ff1a53e84c86` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-2b84794d-a728-4ebd-ba68-d791f6927f8e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-e8b10357-0bc6-4eb6-b663-c72875bc02d7` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-23e08c0c-28d8-4287-9701-113a52a8ef2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ae87999-27d0-4a67-8253-6abec27eecb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ae87999-27d0-4a67-8253-6abec27eecb9
Content-Type: application/json

--- request body ---
{"handle":"qa-b8de71017c41","displayName":"QA b8de71017c41","password":"****","region":"in"}

--- response: 201 in 344 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ae87999-27d0-4a67-8253-6abec27eecb9
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
Location: /v1/accounts/qa-b8de71017c41
X-Served-Region: in
Content-Length: 181

{"id":"acc_22249002-9868-480b-96a6-4a71977e6a03","handle":"qa-b8de71017c41","displayName":"QA b8de71017c41","region":"in","role":"user","createdAt":"2026-11-21T09:57:05.843453029Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-da7af3b8-a6d6-44ed-bc76-75b1a5f71349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da7af3b8-a6d6-44ed-bc76-75b1a5f71349
Content-Type: application/json

--- request body ---
{"handle":"qa-4bbf9efe56d2","displayName":"QA 4bbf9efe56d2","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-da7af3b8-a6d6-44ed-bc76-75b1a5f71349
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
Location: /v1/accounts/qa-4bbf9efe56d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa1a6a65-cf09-420f-966b-69bcb3385e06","handle":"qa-4bbf9efe56d2","displayName":"QA 4bbf9efe56d2","region":"eu","role":"user","createdAt":"2026-11-21T09:57:06.159455420Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3b627a05-0195-4fac-aeff-0cc7710cf57c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b627a05-0195-4fac-aeff-0cc7710cf57c
Content-Type: application/json

--- request body ---
{"handle":"qa-b8de71017c41","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b627a05-0195-4fac-aeff-0cc7710cf57c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22249002-9868-480b-96a6-4a71977e6a03"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6cd86aef-22fc-498a-8249-9484758940aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd86aef-22fc-498a-8249-9484758940aa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4bbf9efe56d2","subject":"Across regions","message":"Namaste"}

--- response: 201 in 76 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cd86aef-22fc-498a-8249-9484758940aa
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
Location: /v1/conversations/cnv_696c4e65-e167-4abe-b912-32cd10881968
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_696c4e65-e167-4abe-b912-32cd10881968","subject":"Across regions","status":"open","region":"eu","participants":["qa-b8de71017c41","qa-4bbf9efe56d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:06.279140515Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_696c4e65-e167-4abe-b912-32cd10881968
correlation: qa-1daa564b-9bc9-420d-a1c5-94238bc77939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1daa564b-9bc9-420d-a1c5-94238bc77939
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1daa564b-9bc9-420d-a1c5-94238bc77939
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

{"id":"cnv_696c4e65-e167-4abe-b912-32cd10881968","subject":"Across regions","status":"open","region":"eu","participants":["qa-b8de71017c41","qa-4bbf9efe56d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:06.279140515Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-afcef544-6842-4677-82ce-39b0feabf6d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afcef544-6842-4677-82ce-39b0feabf6d9
Content-Type: application/json

--- request body ---
{"handle":"qa-4bbf9efe56d2","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-afcef544-6842-4677-82ce-39b0feabf6d9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa1a6a65-cf09-420f-966b-69bcb3385e06"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_696c4e65-e167-4abe-b912-32cd10881968
correlation: qa-53d49a43-e2da-4eca-af7c-48a66ecfdb3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d49a43-e2da-4eca-af7c-48a66ecfdb3a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-53d49a43-e2da-4eca-af7c-48a66ecfdb3a
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

{"id":"cnv_696c4e65-e167-4abe-b912-32cd10881968","subject":"Across regions","status":"open","region":"eu","participants":["qa-b8de71017c41","qa-4bbf9efe56d2"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-21T09:57:06.279140515Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48d501f8-a187-410a-b7a4-ff1a53e84c86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d501f8-a187-410a-b7a4-ff1a53e84c86
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48d501f8-a187-410a-b7a4-ff1a53e84c86
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
correlation: qa-2b84794d-a728-4ebd-ba68-d791f6927f8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b84794d-a728-4ebd-ba68-d791f6927f8e
Content-Type: application/json

--- request body ---
{"handle":"qa-4bbf9efe56d2","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b84794d-a728-4ebd-ba68-d791f6927f8e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b84794d-a728-4ebd-ba68-d791f6927f8e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8b10357-0bc6-4eb6-b663-c72875bc02d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8b10357-0bc6-4eb6-b663-c72875bc02d7
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8b10357-0bc6-4eb6-b663-c72875bc02d7
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
correlation: qa-23e08c0c-28d8-4287-9701-113a52a8ef2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e08c0c-28d8-4287-9701-113a52a8ef2d
Content-Type: application/json

--- request body ---
{"handle":"qa-b8de71017c41","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23e08c0c-28d8-4287-9701-113a52a8ef2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23e08c0c-28d8-4287-9701-113a52a8ef2d"}
```
