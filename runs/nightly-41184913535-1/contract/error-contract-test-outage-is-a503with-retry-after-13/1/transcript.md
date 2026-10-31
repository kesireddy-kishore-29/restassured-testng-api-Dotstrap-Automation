# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-53045230-af04-4923-8831-a0efaa2756e6` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-d12e56c1-7ebc-441d-8e73-e5772441f413` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-332a3b4b-bcde-448d-b19c-d1645d8261ad` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-94f53043-60f6-48e2-b9c4-183dbcf98ede` |
| 5 | `GET /v1/credits/balance` | 503 | 15 | `qa-90bff406-836b-492b-80a3-af034d905c5b` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-9bf046cb-d3f4-4376-acc3-8a714a60696c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-3923ffd3-2428-4739-8126-52e5dff52a0d` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-4d3e0901-ae14-416d-807c-6c5958999e69` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8cd983d2-2e06-4c96-b133-097a9f7261a3` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-370b1461-7457-4cc0-9dfa-994724e69c54` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53045230-af04-4923-8831-a0efaa2756e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53045230-af04-4923-8831-a0efaa2756e6
Content-Type: application/json

--- request body ---
{"handle":"qa-dd0d5f8c189c","displayName":"QA dd0d5f8c189c","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-53045230-af04-4923-8831-a0efaa2756e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Location: /v1/accounts/qa-dd0d5f8c189c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54f3b881-736d-4e83-8ff2-6cc4c24cfb56","handle":"qa-dd0d5f8c189c","displayName":"QA dd0d5f8c189c","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.239525094Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d12e56c1-7ebc-441d-8e73-e5772441f413

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d12e56c1-7ebc-441d-8e73-e5772441f413
Content-Type: application/json

--- request body ---
{"handle":"qa-8ddeee7becf3","displayName":"QA 8ddeee7becf3","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d12e56c1-7ebc-441d-8e73-e5772441f413
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
Location: /v1/accounts/qa-8ddeee7becf3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3c551cc3-d6cf-4637-9cf1-d5d471c00cea","handle":"qa-8ddeee7becf3","displayName":"QA 8ddeee7becf3","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.272694031Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-332a3b4b-bcde-448d-b19c-d1645d8261ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-332a3b4b-bcde-448d-b19c-d1645d8261ad
Content-Type: application/json

--- request body ---
{"handle":"qa-dd0d5f8c189c","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-332a3b4b-bcde-448d-b19c-d1645d8261ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54f3b881-736d-4e83-8ff2-6cc4c24cfb56"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94f53043-60f6-48e2-b9c4-183dbcf98ede

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f53043-60f6-48e2-b9c4-183dbcf98ede
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ddeee7becf3","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-94f53043-60f6-48e2-b9c4-183dbcf98ede
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
Location: /v1/conversations/cnv_fd0bcbc6-e4cf-40ca-aaaa-da6938272ee8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fd0bcbc6-e4cf-40ca-aaaa-da6938272ee8","subject":"Error contract","status":"open","region":"eu","participants":["qa-dd0d5f8c189c","qa-8ddeee7becf3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.356643615Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-90bff406-836b-492b-80a3-af034d905c5b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ef4b0030-3031-44cd-8d37-1c729ad5cde8
X-Correlation-Id: qa-90bff406-836b-492b-80a3-af034d905c5b
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90bff406-836b-492b-80a3-af034d905c5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-90bff406-836b-492b-80a3-af034d905c5b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9bf046cb-d3f4-4376-acc3-8a714a60696c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bf046cb-d3f4-4376-acc3-8a714a60696c
Content-Type: application/json

--- request body ---
{"handle":"qa-8ddeee7becf3","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bf046cb-d3f4-4376-acc3-8a714a60696c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c551cc3-d6cf-4637-9cf1-d5d471c00cea"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3923ffd3-2428-4739-8126-52e5dff52a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3923ffd3-2428-4739-8126-52e5dff52a0d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3923ffd3-2428-4739-8126-52e5dff52a0d
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
correlation: qa-4d3e0901-ae14-416d-807c-6c5958999e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d3e0901-ae14-416d-807c-6c5958999e69
Content-Type: application/json

--- request body ---
{"handle":"qa-8ddeee7becf3","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d3e0901-ae14-416d-807c-6c5958999e69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d3e0901-ae14-416d-807c-6c5958999e69"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cd983d2-2e06-4c96-b133-097a9f7261a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cd983d2-2e06-4c96-b133-097a9f7261a3
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cd983d2-2e06-4c96-b133-097a9f7261a3
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
correlation: qa-370b1461-7457-4cc0-9dfa-994724e69c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-370b1461-7457-4cc0-9dfa-994724e69c54
Content-Type: application/json

--- request body ---
{"handle":"qa-dd0d5f8c189c","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-370b1461-7457-4cc0-9dfa-994724e69c54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-370b1461-7457-4cc0-9dfa-994724e69c54"}
```
