# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-3acf8ce1-6576-48e9-ad44-8ba3455b890e` |
| 2 | `POST /v1/accounts` | 201 | 67 | `qa-d6879288-22c5-4b15-9e99-588251f106a9` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-b317f72d-e5b1-4725-942a-51c1d79f6ef4` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-346ddb51-d940-4ce7-8524-00863f23d8a4` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 26 | `qa-1e4e66c1-acc7-4ed8-974d-6d81c563ce3c` |
| 6 | `POST /v1/auth/token` | 200 | 85 | `qa-d074fa27-004d-4f76-a594-a3bdbb88bdc3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4f466b10-0c32-4daf-b2d1-e5ccb6befc7a` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-4e9a95ce-6cd8-41cc-b70a-817df9d1b85a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-116614fe-53f8-4f63-bf98-1998699a8b13` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-7d373958-fb8b-4dbf-82d5-b82a1e960d35` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3acf8ce1-6576-48e9-ad44-8ba3455b890e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3acf8ce1-6576-48e9-ad44-8ba3455b890e
Content-Type: application/json

--- request body ---
{"handle":"qa-8f742f3bd3b1","displayName":"QA 8f742f3bd3b1","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3acf8ce1-6576-48e9-ad44-8ba3455b890e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 6
Location: /v1/accounts/qa-8f742f3bd3b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55219bcd-b482-4686-b961-9b6dc3828735","handle":"qa-8f742f3bd3b1","displayName":"QA 8f742f3bd3b1","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.717392304Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d6879288-22c5-4b15-9e99-588251f106a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6879288-22c5-4b15-9e99-588251f106a9
Content-Type: application/json

--- request body ---
{"handle":"qa-aba74638221e","displayName":"QA aba74638221e","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6879288-22c5-4b15-9e99-588251f106a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Location: /v1/accounts/qa-aba74638221e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96e8e0c7-505a-47cc-bbeb-0aad03bf01e5","handle":"qa-aba74638221e","displayName":"QA aba74638221e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.809938454Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b317f72d-e5b1-4725-942a-51c1d79f6ef4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b317f72d-e5b1-4725-942a-51c1d79f6ef4
Content-Type: application/json

--- request body ---
{"handle":"qa-8f742f3bd3b1","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b317f72d-e5b1-4725-942a-51c1d79f6ef4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55219bcd-b482-4686-b961-9b6dc3828735"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-346ddb51-d940-4ce7-8524-00863f23d8a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-346ddb51-d940-4ce7-8524-00863f23d8a4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aba74638221e","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-346ddb51-d940-4ce7-8524-00863f23d8a4
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
Location: /v1/conversations/cnv_5f164304-af4d-4121-9d53-5506487532c9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5f164304-af4d-4121-9d53-5506487532c9","subject":"Error contract","status":"open","region":"eu","participants":["qa-8f742f3bd3b1","qa-aba74638221e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.884991962Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5f164304-af4d-4121-9d53-5506487532c9/close
correlation: qa-1e4e66c1-acc7-4ed8-974d-6d81c563ce3c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4d7e79ad-3405-4b3b-ba7c-3776f83a1622
X-Correlation-Id: qa-1e4e66c1-acc7-4ed8-974d-6d81c563ce3c
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e4e66c1-acc7-4ed8-974d-6d81c563ce3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_5f164304-af4d-4121-9d53-5506487532c9/close","correlationId":"qa-1e4e66c1-acc7-4ed8-974d-6d81c563ce3c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d074fa27-004d-4f76-a594-a3bdbb88bdc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d074fa27-004d-4f76-a594-a3bdbb88bdc3
Content-Type: application/json

--- request body ---
{"handle":"qa-aba74638221e","password":"****"}

--- response: 200 in 85 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d074fa27-004d-4f76-a594-a3bdbb88bdc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96e8e0c7-505a-47cc-bbeb-0aad03bf01e5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f466b10-0c32-4daf-b2d1-e5ccb6befc7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f466b10-0c32-4daf-b2d1-e5ccb6befc7a
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f466b10-0c32-4daf-b2d1-e5ccb6befc7a
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
correlation: qa-4e9a95ce-6cd8-41cc-b70a-817df9d1b85a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e9a95ce-6cd8-41cc-b70a-817df9d1b85a
Content-Type: application/json

--- request body ---
{"handle":"qa-aba74638221e","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e9a95ce-6cd8-41cc-b70a-817df9d1b85a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e9a95ce-6cd8-41cc-b70a-817df9d1b85a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-116614fe-53f8-4f63-bf98-1998699a8b13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-116614fe-53f8-4f63-bf98-1998699a8b13
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-116614fe-53f8-4f63-bf98-1998699a8b13
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
correlation: qa-7d373958-fb8b-4dbf-82d5-b82a1e960d35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d373958-fb8b-4dbf-82d5-b82a1e960d35
Content-Type: application/json

--- request body ---
{"handle":"qa-8f742f3bd3b1","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d373958-fb8b-4dbf-82d5-b82a1e960d35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d373958-fb8b-4dbf-82d5-b82a1e960d35"}
```
