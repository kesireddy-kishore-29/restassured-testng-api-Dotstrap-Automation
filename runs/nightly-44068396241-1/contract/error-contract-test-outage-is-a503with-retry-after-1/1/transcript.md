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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-75ffefd8-6d39-45ab-95e0-b24f39500383` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-d16b7f5f-cb0c-4ad6-af55-4e54bea67269` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-cfec27d9-5275-41e0-9521-021cb98ef365` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-cef40179-1b08-415b-aa24-e089f77deeba` |
| 5 | `POST /v1/accounts` | 503 | 15 | `qa-3e4da677-5df5-4289-9cb7-85dc68a6825e` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-d59eb70e-daa0-4d3d-868d-57a1d54cad3a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-84c37696-e338-40bd-aefc-1ddd88561186` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-0f810f45-022e-4fc9-ad89-2753401d36b0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-667a1294-e926-409a-8c4b-c6e87dd74f5c` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-01ccce4b-7291-4147-bcf1-ec8416d40513` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75ffefd8-6d39-45ab-95e0-b24f39500383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ffefd8-6d39-45ab-95e0-b24f39500383
Content-Type: application/json

--- request body ---
{"handle":"qa-b7a05808478a","displayName":"QA b7a05808478a","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-75ffefd8-6d39-45ab-95e0-b24f39500383
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-b7a05808478a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ac431bb-1dfd-467e-92ba-1c7ce6154607","handle":"qa-b7a05808478a","displayName":"QA b7a05808478a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.621003042Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d16b7f5f-cb0c-4ad6-af55-4e54bea67269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d16b7f5f-cb0c-4ad6-af55-4e54bea67269
Content-Type: application/json

--- request body ---
{"handle":"qa-ff35aa378bce","displayName":"QA ff35aa378bce","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-d16b7f5f-cb0c-4ad6-af55-4e54bea67269
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-ff35aa378bce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_36055e3c-3f90-4af7-b589-e5185f794c98","handle":"qa-ff35aa378bce","displayName":"QA ff35aa378bce","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.669679551Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cfec27d9-5275-41e0-9521-021cb98ef365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfec27d9-5275-41e0-9521-021cb98ef365
Content-Type: application/json

--- request body ---
{"handle":"qa-b7a05808478a","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfec27d9-5275-41e0-9521-021cb98ef365
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ac431bb-1dfd-467e-92ba-1c7ce6154607"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cef40179-1b08-415b-aa24-e089f77deeba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cef40179-1b08-415b-aa24-e089f77deeba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ff35aa378bce","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-cef40179-1b08-415b-aa24-e089f77deeba
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
Location: /v1/conversations/cnv_8b7b1f25-345b-4af7-a17c-23bbedca6209
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8b7b1f25-345b-4af7-a17c-23bbedca6209","subject":"Error contract","status":"open","region":"eu","participants":["qa-b7a05808478a","qa-ff35aa378bce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.746217938Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-3e4da677-5df5-4289-9cb7-85dc68a6825e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 53fbf034-11ec-4c3c-a667-38843f2c1f85
X-Correlation-Id: qa-3e4da677-5df5-4289-9cb7-85dc68a6825e
Content-Type: application/json

--- request body ---
{"handle":"qa-8540eb21de70","displayName":"QA 8540eb21de70","password":"****","region":"eu"}

--- response: 503 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e4da677-5df5-4289-9cb7-85dc68a6825e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-3e4da677-5df5-4289-9cb7-85dc68a6825e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d59eb70e-daa0-4d3d-868d-57a1d54cad3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d59eb70e-daa0-4d3d-868d-57a1d54cad3a
Content-Type: application/json

--- request body ---
{"handle":"qa-ff35aa378bce","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-d59eb70e-daa0-4d3d-868d-57a1d54cad3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36055e3c-3f90-4af7-b589-e5185f794c98"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84c37696-e338-40bd-aefc-1ddd88561186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c37696-e338-40bd-aefc-1ddd88561186
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84c37696-e338-40bd-aefc-1ddd88561186
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
correlation: qa-0f810f45-022e-4fc9-ad89-2753401d36b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f810f45-022e-4fc9-ad89-2753401d36b0
Content-Type: application/json

--- request body ---
{"handle":"qa-ff35aa378bce","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f810f45-022e-4fc9-ad89-2753401d36b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f810f45-022e-4fc9-ad89-2753401d36b0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-667a1294-e926-409a-8c4b-c6e87dd74f5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-667a1294-e926-409a-8c4b-c6e87dd74f5c
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-667a1294-e926-409a-8c4b-c6e87dd74f5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-01ccce4b-7291-4147-bcf1-ec8416d40513

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ccce4b-7291-4147-bcf1-ec8416d40513
Content-Type: application/json

--- request body ---
{"handle":"qa-b7a05808478a","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01ccce4b-7291-4147-bcf1-ec8416d40513
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01ccce4b-7291-4147-bcf1-ec8416d40513"}
```
