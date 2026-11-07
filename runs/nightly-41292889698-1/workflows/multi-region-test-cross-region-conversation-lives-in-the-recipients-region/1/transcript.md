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
| 1 | `POST /v1/accounts` | 201 | 505 | `qa-32b2cf1f-de26-4b5a-904d-7a4cdf4ebbdd` |
| 2 | `POST /v1/accounts` | 201 | 95 | `qa-7e020264-7cd8-42fe-95bb-8a4fa021c39a` |
| 3 | `POST /v1/auth/token` | 200 | 66 | `qa-436fabc3-4675-4970-9d3b-8bd523a8b044` |
| 4 | `POST /v1/conversations` | 201 | 107 | `qa-5e90588b-6082-4345-bbdb-fccf34d25ba8` |
| 5 | `GET /v1/conversations/{id}` | 200 | 32 | `qa-caa58e94-4311-4f8f-a315-98f904698524` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-628c0db0-b8f3-4ab6-aaa4-de0f791df7a1` |
| 7 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-17f2609a-7512-4595-a9e0-db38ae2805b3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f62b3105-7a25-4987-97b0-47070fb45e57` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-03280022-73a4-4c73-9777-594aa05a1872` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-8fe8d71b-4640-4b6f-91eb-ec068d09ad0f` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-1ee85c0a-91ff-42b0-b21b-ffcc74e90eed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32b2cf1f-de26-4b5a-904d-7a4cdf4ebbdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b2cf1f-de26-4b5a-904d-7a4cdf4ebbdd
Content-Type: application/json

--- request body ---
{"handle":"qa-4b9b43fc711f","displayName":"QA 4b9b43fc711f","password":"****","region":"in"}

--- response: 201 in 505 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-32b2cf1f-de26-4b5a-904d-7a4cdf4ebbdd
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
Location: /v1/accounts/qa-4b9b43fc711f
X-Served-Region: in
Content-Length: 181

{"id":"acc_96523a2a-798a-4c9d-844a-02ff0cb0cc47","handle":"qa-4b9b43fc711f","displayName":"QA 4b9b43fc711f","region":"in","role":"user","createdAt":"2026-11-01T09:23:23.661962280Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7e020264-7cd8-42fe-95bb-8a4fa021c39a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e020264-7cd8-42fe-95bb-8a4fa021c39a
Content-Type: application/json

--- request body ---
{"handle":"qa-7e8e98ef1915","displayName":"QA 7e8e98ef1915","password":"****","region":"eu"}

--- response: 201 in 95 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e020264-7cd8-42fe-95bb-8a4fa021c39a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-7e8e98ef1915
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ff732e6-c3f5-42f6-adf7-77374e881dad","handle":"qa-7e8e98ef1915","displayName":"QA 7e8e98ef1915","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.116451363Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-436fabc3-4675-4970-9d3b-8bd523a8b044

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-436fabc3-4675-4970-9d3b-8bd523a8b044
Content-Type: application/json

--- request body ---
{"handle":"qa-4b9b43fc711f","password":"****"}

--- response: 200 in 66 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-436fabc3-4675-4970-9d3b-8bd523a8b044
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96523a2a-798a-4c9d-844a-02ff0cb0cc47"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5e90588b-6082-4345-bbdb-fccf34d25ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e90588b-6082-4345-bbdb-fccf34d25ba8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e8e98ef1915","subject":"Across regions","message":"Namaste"}

--- response: 201 in 107 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e90588b-6082-4345-bbdb-fccf34d25ba8
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
Location: /v1/conversations/cnv_4a80b58d-15fd-451e-b505-83a135e3c658
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4a80b58d-15fd-451e-b505-83a135e3c658","subject":"Across regions","status":"open","region":"eu","participants":["qa-4b9b43fc711f","qa-7e8e98ef1915"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.351706285Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_4a80b58d-15fd-451e-b505-83a135e3c658
correlation: qa-caa58e94-4311-4f8f-a315-98f904698524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caa58e94-4311-4f8f-a315-98f904698524
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-caa58e94-4311-4f8f-a315-98f904698524
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

{"id":"cnv_4a80b58d-15fd-451e-b505-83a135e3c658","subject":"Across regions","status":"open","region":"eu","participants":["qa-4b9b43fc711f","qa-7e8e98ef1915"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.351706285Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-628c0db0-b8f3-4ab6-aaa4-de0f791df7a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-628c0db0-b8f3-4ab6-aaa4-de0f791df7a1
Content-Type: application/json

--- request body ---
{"handle":"qa-7e8e98ef1915","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-628c0db0-b8f3-4ab6-aaa4-de0f791df7a1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ff732e6-c3f5-42f6-adf7-77374e881dad"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4a80b58d-15fd-451e-b505-83a135e3c658
correlation: qa-17f2609a-7512-4595-a9e0-db38ae2805b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17f2609a-7512-4595-a9e0-db38ae2805b3
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-17f2609a-7512-4595-a9e0-db38ae2805b3
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

{"id":"cnv_4a80b58d-15fd-451e-b505-83a135e3c658","subject":"Across regions","status":"open","region":"eu","participants":["qa-4b9b43fc711f","qa-7e8e98ef1915"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-01T09:23:24.351706285Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f62b3105-7a25-4987-97b0-47070fb45e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f62b3105-7a25-4987-97b0-47070fb45e57
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f62b3105-7a25-4987-97b0-47070fb45e57
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
correlation: qa-03280022-73a4-4c73-9777-594aa05a1872

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03280022-73a4-4c73-9777-594aa05a1872
Content-Type: application/json

--- request body ---
{"handle":"qa-7e8e98ef1915","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03280022-73a4-4c73-9777-594aa05a1872
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03280022-73a4-4c73-9777-594aa05a1872"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8fe8d71b-4640-4b6f-91eb-ec068d09ad0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fe8d71b-4640-4b6f-91eb-ec068d09ad0f
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8fe8d71b-4640-4b6f-91eb-ec068d09ad0f
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
correlation: qa-1ee85c0a-91ff-42b0-b21b-ffcc74e90eed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ee85c0a-91ff-42b0-b21b-ffcc74e90eed
Content-Type: application/json

--- request body ---
{"handle":"qa-4b9b43fc711f","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ee85c0a-91ff-42b0-b21b-ffcc74e90eed
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ee85c0a-91ff-42b0-b21b-ffcc74e90eed"}
```
