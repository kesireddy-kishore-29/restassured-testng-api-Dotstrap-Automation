# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 56 | `qa-8c4f3bcc-f01b-4951-bb46-c5bbc9c49af7` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-c2a700d3-6cdf-4df0-a9d8-8fe645eb5314` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-57d9aa9a-060f-483b-b303-369f008ff043` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-cb96a268-d3a6-4ada-96ff-907895608f9b` |
| 5 | `DELETE /v1/accounts/me` | 503 | 22 | `qa-295d8e80-af50-41f4-84da-6c20233ceef3` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-3efacf93-f11e-4413-a2bd-95b4e12c3ae7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7be3ff85-0421-44de-93a5-e66710fa50b9` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-55cd2e35-34fd-4d5f-989f-da024a0da209` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-5b242308-f5c1-4391-89b8-2c9dd8ea8a0d` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-d88ef7ed-5c8d-454c-996b-f053b3d27836` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c4f3bcc-f01b-4951-bb46-c5bbc9c49af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c4f3bcc-f01b-4951-bb46-c5bbc9c49af7
Content-Type: application/json

--- request body ---
{"handle":"qa-9870d57ecf7d","displayName":"QA 9870d57ecf7d","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c4f3bcc-f01b-4951-bb46-c5bbc9c49af7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-9870d57ecf7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ff27f8e-0954-445f-9309-34566de9185e","handle":"qa-9870d57ecf7d","displayName":"QA 9870d57ecf7d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.370170564Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c2a700d3-6cdf-4df0-a9d8-8fe645eb5314

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2a700d3-6cdf-4df0-a9d8-8fe645eb5314
Content-Type: application/json

--- request body ---
{"handle":"qa-78e935fd2923","displayName":"QA 78e935fd2923","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2a700d3-6cdf-4df0-a9d8-8fe645eb5314
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-78e935fd2923
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd06a13c-972a-4541-a472-08478b076bb1","handle":"qa-78e935fd2923","displayName":"QA 78e935fd2923","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.439425147Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-57d9aa9a-060f-483b-b303-369f008ff043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57d9aa9a-060f-483b-b303-369f008ff043
Content-Type: application/json

--- request body ---
{"handle":"qa-9870d57ecf7d","password":"****"}

--- response: 200 in 59 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-57d9aa9a-060f-483b-b303-369f008ff043
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ff27f8e-0954-445f-9309-34566de9185e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cb96a268-d3a6-4ada-96ff-907895608f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb96a268-d3a6-4ada-96ff-907895608f9b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78e935fd2923","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb96a268-d3a6-4ada-96ff-907895608f9b
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
Location: /v1/conversations/cnv_aa88f8ec-b3bf-48ae-8ef6-0f4439fc059f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aa88f8ec-b3bf-48ae-8ef6-0f4439fc059f","subject":"Error contract","status":"open","region":"eu","participants":["qa-9870d57ecf7d","qa-78e935fd2923"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.548714246Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-295d8e80-af50-41f4-84da-6c20233ceef3

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8376678b-40fe-4251-8555-4ad81bfa0141
X-Correlation-Id: qa-295d8e80-af50-41f4-84da-6c20233ceef3
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-295d8e80-af50-41f4-84da-6c20233ceef3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-295d8e80-af50-41f4-84da-6c20233ceef3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3efacf93-f11e-4413-a2bd-95b4e12c3ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3efacf93-f11e-4413-a2bd-95b4e12c3ae7
Content-Type: application/json

--- request body ---
{"handle":"qa-78e935fd2923","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3efacf93-f11e-4413-a2bd-95b4e12c3ae7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd06a13c-972a-4541-a472-08478b076bb1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7be3ff85-0421-44de-93a5-e66710fa50b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7be3ff85-0421-44de-93a5-e66710fa50b9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7be3ff85-0421-44de-93a5-e66710fa50b9
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
correlation: qa-55cd2e35-34fd-4d5f-989f-da024a0da209

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55cd2e35-34fd-4d5f-989f-da024a0da209
Content-Type: application/json

--- request body ---
{"handle":"qa-78e935fd2923","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55cd2e35-34fd-4d5f-989f-da024a0da209
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55cd2e35-34fd-4d5f-989f-da024a0da209"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b242308-f5c1-4391-89b8-2c9dd8ea8a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b242308-f5c1-4391-89b8-2c9dd8ea8a0d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b242308-f5c1-4391-89b8-2c9dd8ea8a0d
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
correlation: qa-d88ef7ed-5c8d-454c-996b-f053b3d27836

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d88ef7ed-5c8d-454c-996b-f053b3d27836
Content-Type: application/json

--- request body ---
{"handle":"qa-9870d57ecf7d","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d88ef7ed-5c8d-454c-996b-f053b3d27836
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d88ef7ed-5c8d-454c-996b-f053b3d27836"}
```
