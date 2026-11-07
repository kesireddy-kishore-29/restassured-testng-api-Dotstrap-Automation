# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 641 | `qa-536db225-ee75-4728-96ff-044c43a21615` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-93c9ca3f-8990-4051-bf5b-8b52b4143fdc` |
| 3 | `POST /v1/auth/token` | 200 | 76 | `qa-e1218ba4-efda-4019-a59a-ddfc71171ad6` |
| 4 | `POST /v1/conversations` | 201 | 119 | `qa-b3f64183-a5af-4837-82ec-d5b5755a71ea` |
| 5 | `POST /v1/auth/token` | 422 | 47 | `qa-43d401bc-eee0-43ce-831f-d7217a9a503d` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-3df621f6-b799-479d-a31b-12633b42e6f3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-18e3c3af-80db-4b7f-a67a-a259ea53cd3c` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-4c5e0a66-e7be-4fdb-8215-7905b92c2a64` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-f2c43035-c1f7-4d7d-b7d2-2f801a8564f0` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-8751a1b9-ae5d-47e4-913f-6fd1a33db268` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-536db225-ee75-4728-96ff-044c43a21615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-536db225-ee75-4728-96ff-044c43a21615
Content-Type: application/json

--- request body ---
{"handle":"qa-6ec706b63aaa","displayName":"QA 6ec706b63aaa","password":"****","region":"eu"}

--- response: 201 in 641 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-536db225-ee75-4728-96ff-044c43a21615
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
Location: /v1/accounts/qa-6ec706b63aaa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_491289e6-13e8-449a-aa48-a4bdf262bf4b","handle":"qa-6ec706b63aaa","displayName":"QA 6ec706b63aaa","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.864530441Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-93c9ca3f-8990-4051-bf5b-8b52b4143fdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c9ca3f-8990-4051-bf5b-8b52b4143fdc
Content-Type: application/json

--- request body ---
{"handle":"qa-99fc93bd0d9d","displayName":"QA 99fc93bd0d9d","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-93c9ca3f-8990-4051-bf5b-8b52b4143fdc
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
Location: /v1/accounts/qa-99fc93bd0d9d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ef8c954-3547-4494-9eba-00ab7ec674b3","handle":"qa-99fc93bd0d9d","displayName":"QA 99fc93bd0d9d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.267980245Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e1218ba4-efda-4019-a59a-ddfc71171ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1218ba4-efda-4019-a59a-ddfc71171ad6
Content-Type: application/json

--- request body ---
{"handle":"qa-6ec706b63aaa","password":"****"}

--- response: 200 in 76 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1218ba4-efda-4019-a59a-ddfc71171ad6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_491289e6-13e8-449a-aa48-a4bdf262bf4b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b3f64183-a5af-4837-82ec-d5b5755a71ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3f64183-a5af-4837-82ec-d5b5755a71ea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-99fc93bd0d9d","subject":"Error contract","message":"Hi"}

--- response: 201 in 119 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3f64183-a5af-4837-82ec-d5b5755a71ea
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
Location: /v1/conversations/cnv_ba0936ab-337f-4e2b-a1cb-b965de339921
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ba0936ab-337f-4e2b-a1cb-b965de339921","subject":"Error contract","status":"open","region":"eu","participants":["qa-6ec706b63aaa","qa-99fc93bd0d9d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.572193981Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-43d401bc-eee0-43ce-831f-d7217a9a503d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d401bc-eee0-43ce-831f-d7217a9a503d
Content-Type: application/json

--- request body ---
{"handle":"qa-6ec706b63aaa","password":"****","ttlSeconds":0}

--- response: 422 in 47 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43d401bc-eee0-43ce-831f-d7217a9a503d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-43d401bc-eee0-43ce-831f-d7217a9a503d","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3df621f6-b799-479d-a31b-12633b42e6f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df621f6-b799-479d-a31b-12633b42e6f3
Content-Type: application/json

--- request body ---
{"handle":"qa-99fc93bd0d9d","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3df621f6-b799-479d-a31b-12633b42e6f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ef8c954-3547-4494-9eba-00ab7ec674b3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18e3c3af-80db-4b7f-a67a-a259ea53cd3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e3c3af-80db-4b7f-a67a-a259ea53cd3c
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18e3c3af-80db-4b7f-a67a-a259ea53cd3c
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
correlation: qa-4c5e0a66-e7be-4fdb-8215-7905b92c2a64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c5e0a66-e7be-4fdb-8215-7905b92c2a64
Content-Type: application/json

--- request body ---
{"handle":"qa-99fc93bd0d9d","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c5e0a66-e7be-4fdb-8215-7905b92c2a64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c5e0a66-e7be-4fdb-8215-7905b92c2a64"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2c43035-c1f7-4d7d-b7d2-2f801a8564f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c43035-c1f7-4d7d-b7d2-2f801a8564f0
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2c43035-c1f7-4d7d-b7d2-2f801a8564f0
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
correlation: qa-8751a1b9-ae5d-47e4-913f-6fd1a33db268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8751a1b9-ae5d-47e4-913f-6fd1a33db268
Content-Type: application/json

--- request body ---
{"handle":"qa-6ec706b63aaa","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8751a1b9-ae5d-47e4-913f-6fd1a33db268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8751a1b9-ae5d-47e4-913f-6fd1a33db268"}
```
