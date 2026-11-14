# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-38c24684-aaf9-47e1-a00c-36c55b5797b5` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-08f61ee1-6a59-4d5d-bcd1-f9fc84f36851` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-e54b86b5-3937-4ba3-95b2-c8b663dc51b9` |
| 4 | `POST /v1/conversations` | 201 | 45 | `qa-5b835660-a46a-43e7-b375-129ce731c383` |
| 5 | `POST /v1/accounts` | 503 | 12 | `qa-f91a59c7-0050-46ca-9c5a-3b388202006f` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-6633f3ba-356c-4ef8-abdd-de057c23184e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-6f7aa1c0-5add-48fb-99d8-9ffe6987814e` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-3e329769-a371-4848-baac-f75b38134269` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8e36a12f-ca36-45ce-a654-92e19fc80560` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-c56cd6d9-e7ea-4b22-8597-c7e306d3426b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-38c24684-aaf9-47e1-a00c-36c55b5797b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38c24684-aaf9-47e1-a00c-36c55b5797b5
Content-Type: application/json

--- request body ---
{"handle":"qa-a6364542037d","displayName":"QA a6364542037d","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-38c24684-aaf9-47e1-a00c-36c55b5797b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-a6364542037d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5dbf260f-1b65-4d3b-b09e-c4c5ca99b766","handle":"qa-a6364542037d","displayName":"QA a6364542037d","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.051374385Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-08f61ee1-6a59-4d5d-bcd1-f9fc84f36851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08f61ee1-6a59-4d5d-bcd1-f9fc84f36851
Content-Type: application/json

--- request body ---
{"handle":"qa-0e578cef689e","displayName":"QA 0e578cef689e","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-08f61ee1-6a59-4d5d-bcd1-f9fc84f36851
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-0e578cef689e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15c6e73b-c798-442d-989b-5df6e8918e03","handle":"qa-0e578cef689e","displayName":"QA 0e578cef689e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.074259704Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e54b86b5-3937-4ba3-95b2-c8b663dc51b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e54b86b5-3937-4ba3-95b2-c8b663dc51b9
Content-Type: application/json

--- request body ---
{"handle":"qa-a6364542037d","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e54b86b5-3937-4ba3-95b2-c8b663dc51b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5dbf260f-1b65-4d3b-b09e-c4c5ca99b766"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5b835660-a46a-43e7-b375-129ce731c383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b835660-a46a-43e7-b375-129ce731c383
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e578cef689e","subject":"Error contract","message":"Hi"}

--- response: 201 in 45 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b835660-a46a-43e7-b375-129ce731c383
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
Location: /v1/conversations/cnv_50979cda-9cd4-4bc2-a933-4d7c3be2808c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_50979cda-9cd4-4bc2-a933-4d7c3be2808c","subject":"Error contract","status":"open","region":"eu","participants":["qa-a6364542037d","qa-0e578cef689e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.153441080Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f91a59c7-0050-46ca-9c5a-3b388202006f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 52d245e4-1392-4058-96e3-81c7303cac87
X-Correlation-Id: qa-f91a59c7-0050-46ca-9c5a-3b388202006f
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6df86a7b28","displayName":"QA 8b6df86a7b28","password":"****","region":"eu"}

--- response: 503 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f91a59c7-0050-46ca-9c5a-3b388202006f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-f91a59c7-0050-46ca-9c5a-3b388202006f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6633f3ba-356c-4ef8-abdd-de057c23184e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6633f3ba-356c-4ef8-abdd-de057c23184e
Content-Type: application/json

--- request body ---
{"handle":"qa-0e578cef689e","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6633f3ba-356c-4ef8-abdd-de057c23184e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15c6e73b-c798-442d-989b-5df6e8918e03"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f7aa1c0-5add-48fb-99d8-9ffe6987814e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f7aa1c0-5add-48fb-99d8-9ffe6987814e
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f7aa1c0-5add-48fb-99d8-9ffe6987814e
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
correlation: qa-3e329769-a371-4848-baac-f75b38134269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e329769-a371-4848-baac-f75b38134269
Content-Type: application/json

--- request body ---
{"handle":"qa-0e578cef689e","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e329769-a371-4848-baac-f75b38134269
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e329769-a371-4848-baac-f75b38134269"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e36a12f-ca36-45ce-a654-92e19fc80560

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e36a12f-ca36-45ce-a654-92e19fc80560
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e36a12f-ca36-45ce-a654-92e19fc80560
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
correlation: qa-c56cd6d9-e7ea-4b22-8597-c7e306d3426b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c56cd6d9-e7ea-4b22-8597-c7e306d3426b
Content-Type: application/json

--- request body ---
{"handle":"qa-a6364542037d","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c56cd6d9-e7ea-4b22-8597-c7e306d3426b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c56cd6d9-e7ea-4b22-8597-c7e306d3426b"}
```
