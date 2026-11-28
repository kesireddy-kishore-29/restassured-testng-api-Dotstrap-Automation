# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-4a652ceb-dcf8-4559-86b9-0010a91b3e1b` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-0d91e9b6-4843-4732-a14d-9a6bbb1b96e1` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-eddb4f09-4835-4273-bcfe-3e589b5a542d` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-33aff95e-fbdc-47f3-b3a9-b5416b605795` |
| 5 | `POST /v1/accounts` | 400 | 18 | `qa-bc88a58e-3d8d-47ab-90c0-78862fc554e5` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-40d994db-ea71-4bc9-9825-dc1ff4eedfc2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ca40dcfd-627d-42b3-b70b-3c3f2fed6216` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-65f65138-2984-4dc8-ae96-6188f70f1f9a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-f607e80c-f303-491e-b329-a15fa522906c` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-55cf281a-e9bf-4193-94dd-21e537eeaf62` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4a652ceb-dcf8-4559-86b9-0010a91b3e1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a652ceb-dcf8-4559-86b9-0010a91b3e1b
Content-Type: application/json

--- request body ---
{"handle":"qa-7a07ca2e874a","displayName":"QA 7a07ca2e874a","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a652ceb-dcf8-4559-86b9-0010a91b3e1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-7a07ca2e874a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a0e6b4c-f864-4c3d-aace-5003d63ce818","handle":"qa-7a07ca2e874a","displayName":"QA 7a07ca2e874a","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.406384601Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0d91e9b6-4843-4732-a14d-9a6bbb1b96e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d91e9b6-4843-4732-a14d-9a6bbb1b96e1
Content-Type: application/json

--- request body ---
{"handle":"qa-25861b4d2fab","displayName":"QA 25861b4d2fab","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d91e9b6-4843-4732-a14d-9a6bbb1b96e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-25861b4d2fab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63cbef06-4196-4131-aafc-9c9dab9e9759","handle":"qa-25861b4d2fab","displayName":"QA 25861b4d2fab","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.431142440Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eddb4f09-4835-4273-bcfe-3e589b5a542d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eddb4f09-4835-4273-bcfe-3e589b5a542d
Content-Type: application/json

--- request body ---
{"handle":"qa-7a07ca2e874a","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-eddb4f09-4835-4273-bcfe-3e589b5a542d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a0e6b4c-f864-4c3d-aace-5003d63ce818"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33aff95e-fbdc-47f3-b3a9-b5416b605795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33aff95e-fbdc-47f3-b3a9-b5416b605795
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25861b4d2fab","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-33aff95e-fbdc-47f3-b3a9-b5416b605795
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
Location: /v1/conversations/cnv_59cf3506-ea84-4eac-a49b-f650eab7e47d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_59cf3506-ea84-4eac-a49b-f650eab7e47d","subject":"Error contract","status":"open","region":"eu","participants":["qa-7a07ca2e874a","qa-25861b4d2fab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.515487277Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-bc88a58e-3d8d-47ab-90c0-78862fc554e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc88a58e-3d8d-47ab-90c0-78862fc554e5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc88a58e-3d8d-47ab-90c0-78862fc554e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-bc88a58e-3d8d-47ab-90c0-78862fc554e5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-40d994db-ea71-4bc9-9825-dc1ff4eedfc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40d994db-ea71-4bc9-9825-dc1ff4eedfc2
Content-Type: application/json

--- request body ---
{"handle":"qa-25861b4d2fab","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-40d994db-ea71-4bc9-9825-dc1ff4eedfc2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63cbef06-4196-4131-aafc-9c9dab9e9759"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca40dcfd-627d-42b3-b70b-3c3f2fed6216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca40dcfd-627d-42b3-b70b-3c3f2fed6216
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca40dcfd-627d-42b3-b70b-3c3f2fed6216
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
correlation: qa-65f65138-2984-4dc8-ae96-6188f70f1f9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f65138-2984-4dc8-ae96-6188f70f1f9a
Content-Type: application/json

--- request body ---
{"handle":"qa-25861b4d2fab","password":"****"}

--- response: 401 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65f65138-2984-4dc8-ae96-6188f70f1f9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65f65138-2984-4dc8-ae96-6188f70f1f9a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f607e80c-f303-491e-b329-a15fa522906c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f607e80c-f303-491e-b329-a15fa522906c
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f607e80c-f303-491e-b329-a15fa522906c
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
correlation: qa-55cf281a-e9bf-4193-94dd-21e537eeaf62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55cf281a-e9bf-4193-94dd-21e537eeaf62
Content-Type: application/json

--- request body ---
{"handle":"qa-7a07ca2e874a","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55cf281a-e9bf-4193-94dd-21e537eeaf62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55cf281a-e9bf-4193-94dd-21e537eeaf62"}
```
