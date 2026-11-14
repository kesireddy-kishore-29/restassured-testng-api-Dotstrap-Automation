# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-f6977e14-177f-4c0a-98cc-0234af5a5567` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-f5352bd4-d931-44e8-80ed-6efc9cc164b9` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-b08a1243-acc3-4369-b070-13fc5a0f78d5` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-c2959bde-b573-4ac5-8f5a-122dc2134aef` |
| 5 | `GET /v1/conversations/{id}` | 503 | 24 | `qa-40cbdbe1-4727-4966-8ed8-da4a9ae3f959` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-49a7f633-5247-457d-9411-9304755ade72` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-0f13ca1f-7374-43dc-ad8f-274320672d11` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-05af9b81-61ac-4043-8ee5-4da838b85136` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-c7628ac5-d111-43a4-8518-cb32031a212a` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-8ae36aa7-a6de-4952-9efa-c2fd66c76c2b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6977e14-177f-4c0a-98cc-0234af5a5567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6977e14-177f-4c0a-98cc-0234af5a5567
Content-Type: application/json

--- request body ---
{"handle":"qa-1cd6444f59d1","displayName":"QA 1cd6444f59d1","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6977e14-177f-4c0a-98cc-0234af5a5567
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Location: /v1/accounts/qa-1cd6444f59d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a4ec54d-3ba6-4295-a8e7-4d73aeedede5","handle":"qa-1cd6444f59d1","displayName":"QA 1cd6444f59d1","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.560522304Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f5352bd4-d931-44e8-80ed-6efc9cc164b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5352bd4-d931-44e8-80ed-6efc9cc164b9
Content-Type: application/json

--- request body ---
{"handle":"qa-7df648fbbd9c","displayName":"QA 7df648fbbd9c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5352bd4-d931-44e8-80ed-6efc9cc164b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Location: /v1/accounts/qa-7df648fbbd9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_446ed8f5-4eb1-4752-a9db-209a64d32c97","handle":"qa-7df648fbbd9c","displayName":"QA 7df648fbbd9c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.609317353Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b08a1243-acc3-4369-b070-13fc5a0f78d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b08a1243-acc3-4369-b070-13fc5a0f78d5
Content-Type: application/json

--- request body ---
{"handle":"qa-1cd6444f59d1","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b08a1243-acc3-4369-b070-13fc5a0f78d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a4ec54d-3ba6-4295-a8e7-4d73aeedede5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c2959bde-b573-4ac5-8f5a-122dc2134aef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2959bde-b573-4ac5-8f5a-122dc2134aef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7df648fbbd9c","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2959bde-b573-4ac5-8f5a-122dc2134aef
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
Location: /v1/conversations/cnv_701562b1-da75-4742-a18a-8d34967b4a1b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_701562b1-da75-4742-a18a-8d34967b4a1b","subject":"Error contract","status":"open","region":"eu","participants":["qa-1cd6444f59d1","qa-7df648fbbd9c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.676418798Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_701562b1-da75-4742-a18a-8d34967b4a1b
correlation: qa-40cbdbe1-4727-4966-8ed8-da4a9ae3f959

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4399fab1-9264-44c9-9aa0-aaaac74a4d8b
X-Correlation-Id: qa-40cbdbe1-4727-4966-8ed8-da4a9ae3f959
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40cbdbe1-4727-4966-8ed8-da4a9ae3f959
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_701562b1-da75-4742-a18a-8d34967b4a1b","correlationId":"qa-40cbdbe1-4727-4966-8ed8-da4a9ae3f959"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-49a7f633-5247-457d-9411-9304755ade72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49a7f633-5247-457d-9411-9304755ade72
Content-Type: application/json

--- request body ---
{"handle":"qa-7df648fbbd9c","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-49a7f633-5247-457d-9411-9304755ade72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_446ed8f5-4eb1-4752-a9db-209a64d32c97"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f13ca1f-7374-43dc-ad8f-274320672d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f13ca1f-7374-43dc-ad8f-274320672d11
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f13ca1f-7374-43dc-ad8f-274320672d11
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
correlation: qa-05af9b81-61ac-4043-8ee5-4da838b85136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05af9b81-61ac-4043-8ee5-4da838b85136
Content-Type: application/json

--- request body ---
{"handle":"qa-7df648fbbd9c","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05af9b81-61ac-4043-8ee5-4da838b85136
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05af9b81-61ac-4043-8ee5-4da838b85136"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7628ac5-d111-43a4-8518-cb32031a212a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7628ac5-d111-43a4-8518-cb32031a212a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7628ac5-d111-43a4-8518-cb32031a212a
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
correlation: qa-8ae36aa7-a6de-4952-9efa-c2fd66c76c2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae36aa7-a6de-4952-9efa-c2fd66c76c2b
Content-Type: application/json

--- request body ---
{"handle":"qa-1cd6444f59d1","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ae36aa7-a6de-4952-9efa-c2fd66c76c2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ae36aa7-a6de-4952-9efa-c2fd66c76c2b"}
```
