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
| 1 | `POST /v1/accounts` | 201 | 593 | `qa-64a230fd-f38d-4893-b039-499b7804d644` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-2e257606-2cb5-4a82-82ab-baa4887abd0d` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-b18618e6-2028-489f-8d82-741bc36072d3` |
| 4 | `POST /v1/conversations` | 201 | 108 | `qa-9eb3e3ed-4d3a-410c-9bc0-566356f55d7e` |
| 5 | `GET /v1/conversations/{id}` | 200 | 30 | `qa-03ba373b-e05a-4a28-8bae-0888808d1fe1` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-c6356134-6459-4687-84cb-ad654f869a84` |
| 7 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-84ad0b62-4ac6-4bff-812a-385eec580cc9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b68bd24f-73df-4a15-b228-3cacdf710efd` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-db8fe864-b267-4a84-bc18-4d4e56983a76` |
| 10 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-ef79b47f-8e30-41a7-97eb-9e0e64aa3d78` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-a4f93b8f-eee7-456d-ab81-396e7b95cafe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-64a230fd-f38d-4893-b039-499b7804d644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64a230fd-f38d-4893-b039-499b7804d644
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc65d4cfe3c","displayName":"QA bbc65d4cfe3c","password":"****","region":"in"}

--- response: 201 in 593 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-64a230fd-f38d-4893-b039-499b7804d644
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
Location: /v1/accounts/qa-bbc65d4cfe3c
X-Served-Region: in
Content-Length: 181

{"id":"acc_5cfe7d42-138d-437b-b905-a07c0b6b534e","handle":"qa-bbc65d4cfe3c","displayName":"QA bbc65d4cfe3c","region":"in","role":"user","createdAt":"2026-10-31T08:31:35.603152831Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2e257606-2cb5-4a82-82ab-baa4887abd0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e257606-2cb5-4a82-82ab-baa4887abd0d
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3780579a9d","displayName":"QA ca3780579a9d","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e257606-2cb5-4a82-82ab-baa4887abd0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-ca3780579a9d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c8f3578-b183-49aa-a3a4-f84a4c2990c8","handle":"qa-ca3780579a9d","displayName":"QA ca3780579a9d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.024989091Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b18618e6-2028-489f-8d82-741bc36072d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18618e6-2028-489f-8d82-741bc36072d3
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc65d4cfe3c","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b18618e6-2028-489f-8d82-741bc36072d3
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5cfe7d42-138d-437b-b905-a07c0b6b534e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9eb3e3ed-4d3a-410c-9bc0-566356f55d7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eb3e3ed-4d3a-410c-9bc0-566356f55d7e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ca3780579a9d","subject":"Across regions","message":"Namaste"}

--- response: 201 in 108 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eb3e3ed-4d3a-410c-9bc0-566356f55d7e
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
Location: /v1/conversations/cnv_a068a631-942c-4402-9be0-c092daecce66
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a068a631-942c-4402-9be0-c092daecce66","subject":"Across regions","status":"open","region":"eu","participants":["qa-bbc65d4cfe3c","qa-ca3780579a9d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.291331826Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_a068a631-942c-4402-9be0-c092daecce66
correlation: qa-03ba373b-e05a-4a28-8bae-0888808d1fe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ba373b-e05a-4a28-8bae-0888808d1fe1
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-03ba373b-e05a-4a28-8bae-0888808d1fe1
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

{"id":"cnv_a068a631-942c-4402-9be0-c092daecce66","subject":"Across regions","status":"open","region":"eu","participants":["qa-bbc65d4cfe3c","qa-ca3780579a9d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.291331826Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c6356134-6459-4687-84cb-ad654f869a84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6356134-6459-4687-84cb-ad654f869a84
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3780579a9d","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6356134-6459-4687-84cb-ad654f869a84
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c8f3578-b183-49aa-a3a4-f84a4c2990c8"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a068a631-942c-4402-9be0-c092daecce66
correlation: qa-84ad0b62-4ac6-4bff-812a-385eec580cc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84ad0b62-4ac6-4bff-812a-385eec580cc9
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-84ad0b62-4ac6-4bff-812a-385eec580cc9
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

{"id":"cnv_a068a631-942c-4402-9be0-c092daecce66","subject":"Across regions","status":"open","region":"eu","participants":["qa-bbc65d4cfe3c","qa-ca3780579a9d"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-31T08:31:36.291331826Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b68bd24f-73df-4a15-b228-3cacdf710efd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b68bd24f-73df-4a15-b228-3cacdf710efd
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b68bd24f-73df-4a15-b228-3cacdf710efd
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
correlation: qa-db8fe864-b267-4a84-bc18-4d4e56983a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db8fe864-b267-4a84-bc18-4d4e56983a76
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3780579a9d","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db8fe864-b267-4a84-bc18-4d4e56983a76
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db8fe864-b267-4a84-bc18-4d4e56983a76"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef79b47f-8e30-41a7-97eb-9e0e64aa3d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef79b47f-8e30-41a7-97eb-9e0e64aa3d78
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef79b47f-8e30-41a7-97eb-9e0e64aa3d78
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
correlation: qa-a4f93b8f-eee7-456d-ab81-396e7b95cafe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4f93b8f-eee7-456d-ab81-396e7b95cafe
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc65d4cfe3c","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4f93b8f-eee7-456d-ab81-396e7b95cafe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4f93b8f-eee7-456d-ab81-396e7b95cafe"}
```
