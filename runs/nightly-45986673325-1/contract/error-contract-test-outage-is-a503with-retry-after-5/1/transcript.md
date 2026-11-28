# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-4e7a03aa-3cd6-4d28-ac0b-e21f33d6c778` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-9c19f3b8-04d7-47b2-b4e0-7910c045f24d` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-3c09c2f2-a1a3-4b0a-a8e0-e16c20b6fc5d` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-27878707-1b09-4c07-b184-be0a937f1960` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 8 | `qa-488d32dc-79ef-4dd8-99f4-3b244734e13f` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-3f0cd2dc-9895-4952-8a30-39a3b0c7fc60` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-b4d0730f-f512-4416-a1a2-0f9d21dc25c2` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-716f4158-23b0-442e-80fd-429e6dcf9156` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-f4a70424-16c1-4451-b0c4-cd10ecbef37d` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-84e42ef9-0d55-4bd0-ba59-069ee37c8d08` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e7a03aa-3cd6-4d28-ac0b-e21f33d6c778

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e7a03aa-3cd6-4d28-ac0b-e21f33d6c778
Content-Type: application/json

--- request body ---
{"handle":"qa-97454ac7a244","displayName":"QA 97454ac7a244","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e7a03aa-3cd6-4d28-ac0b-e21f33d6c778
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-97454ac7a244
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f3b0089-8d56-4730-ae1a-ef8d666d28d8","handle":"qa-97454ac7a244","displayName":"QA 97454ac7a244","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.562726766Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9c19f3b8-04d7-47b2-b4e0-7910c045f24d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c19f3b8-04d7-47b2-b4e0-7910c045f24d
Content-Type: application/json

--- request body ---
{"handle":"qa-ce4a4b4f943f","displayName":"QA ce4a4b4f943f","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c19f3b8-04d7-47b2-b4e0-7910c045f24d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-ce4a4b4f943f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2606dc1a-d46b-4fea-9f9c-54c7928b66b3","handle":"qa-ce4a4b4f943f","displayName":"QA ce4a4b4f943f","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.626146129Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3c09c2f2-a1a3-4b0a-a8e0-e16c20b6fc5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c09c2f2-a1a3-4b0a-a8e0-e16c20b6fc5d
Content-Type: application/json

--- request body ---
{"handle":"qa-97454ac7a244","password":"****"}

--- response: 200 in 61 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c09c2f2-a1a3-4b0a-a8e0-e16c20b6fc5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f3b0089-8d56-4730-ae1a-ef8d666d28d8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-27878707-1b09-4c07-b184-be0a937f1960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27878707-1b09-4c07-b184-be0a937f1960
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ce4a4b4f943f","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-27878707-1b09-4c07-b184-be0a937f1960
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
Location: /v1/conversations/cnv_15d2cb32-0786-4b66-8205-69d7c21aeddd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_15d2cb32-0786-4b66-8205-69d7c21aeddd","subject":"Error contract","status":"open","region":"eu","participants":["qa-97454ac7a244","qa-ce4a4b4f943f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.766141982Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-97454ac7a244
correlation: qa-488d32dc-79ef-4dd8-99f4-3b244734e13f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fa351104-5298-4f63-9395-55ea4ef6a5dd
X-Correlation-Id: qa-488d32dc-79ef-4dd8-99f4-3b244734e13f
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-488d32dc-79ef-4dd8-99f4-3b244734e13f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-97454ac7a244","correlationId":"qa-488d32dc-79ef-4dd8-99f4-3b244734e13f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3f0cd2dc-9895-4952-8a30-39a3b0c7fc60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f0cd2dc-9895-4952-8a30-39a3b0c7fc60
Content-Type: application/json

--- request body ---
{"handle":"qa-ce4a4b4f943f","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f0cd2dc-9895-4952-8a30-39a3b0c7fc60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2606dc1a-d46b-4fea-9f9c-54c7928b66b3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4d0730f-f512-4416-a1a2-0f9d21dc25c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4d0730f-f512-4416-a1a2-0f9d21dc25c2
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4d0730f-f512-4416-a1a2-0f9d21dc25c2
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-716f4158-23b0-442e-80fd-429e6dcf9156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-716f4158-23b0-442e-80fd-429e6dcf9156
Content-Type: application/json

--- request body ---
{"handle":"qa-ce4a4b4f943f","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-716f4158-23b0-442e-80fd-429e6dcf9156
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-716f4158-23b0-442e-80fd-429e6dcf9156"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4a70424-16c1-4451-b0c4-cd10ecbef37d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4a70424-16c1-4451-b0c4-cd10ecbef37d
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f4a70424-16c1-4451-b0c4-cd10ecbef37d
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-84e42ef9-0d55-4bd0-ba59-069ee37c8d08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84e42ef9-0d55-4bd0-ba59-069ee37c8d08
Content-Type: application/json

--- request body ---
{"handle":"qa-97454ac7a244","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84e42ef9-0d55-4bd0-ba59-069ee37c8d08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84e42ef9-0d55-4bd0-ba59-069ee37c8d08"}
```
