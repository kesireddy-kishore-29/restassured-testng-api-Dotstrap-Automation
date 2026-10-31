# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-a466d56b-ad8c-4013-ab0e-6e25bef517bf` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-202a0ea7-232f-4232-8a85-17bb1f07a838` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-7c31579a-3844-40b4-9085-9e4782ec3151` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-190bd4e0-cc1e-435b-aafa-9ba822ce1910` |
| 5 | `POST /v1/auth/token` | 503 | 11 | `qa-fcf042f9-a069-4c87-bcfd-3c4e454bef5c` |
| 6 | `POST /v1/auth/token` | 200 | 59 | `qa-b77a4ade-228c-46da-bb75-6b382b5239de` |
| 7 | `DELETE /v1/accounts/me` | 204 | 63 | `qa-3f4d7c73-963f-4446-b2f9-cd8114d594f5` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-b84709e3-ec50-40c1-a194-0fd4bc0bf5e0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-03a790bb-224c-4610-9b5a-d2ce07bd6481` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-dc5020d8-8798-4635-a8fb-d1338a300c9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a466d56b-ad8c-4013-ab0e-6e25bef517bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a466d56b-ad8c-4013-ab0e-6e25bef517bf
Content-Type: application/json

--- request body ---
{"handle":"qa-cbb6a5d771c1","displayName":"QA cbb6a5d771c1","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a466d56b-ad8c-4013-ab0e-6e25bef517bf
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
Location: /v1/accounts/qa-cbb6a5d771c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f771bc1-b81b-4811-8597-49b3eb186a60","handle":"qa-cbb6a5d771c1","displayName":"QA cbb6a5d771c1","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.095504479Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-202a0ea7-232f-4232-8a85-17bb1f07a838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-202a0ea7-232f-4232-8a85-17bb1f07a838
Content-Type: application/json

--- request body ---
{"handle":"qa-6d0363cd60cb","displayName":"QA 6d0363cd60cb","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-202a0ea7-232f-4232-8a85-17bb1f07a838
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-6d0363cd60cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ba06ffb-21d0-4106-876c-68d9df6ed768","handle":"qa-6d0363cd60cb","displayName":"QA 6d0363cd60cb","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.149536498Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7c31579a-3844-40b4-9085-9e4782ec3151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c31579a-3844-40b4-9085-9e4782ec3151
Content-Type: application/json

--- request body ---
{"handle":"qa-cbb6a5d771c1","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c31579a-3844-40b4-9085-9e4782ec3151
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f771bc1-b81b-4811-8597-49b3eb186a60"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-190bd4e0-cc1e-435b-aafa-9ba822ce1910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190bd4e0-cc1e-435b-aafa-9ba822ce1910
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6d0363cd60cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-190bd4e0-cc1e-435b-aafa-9ba822ce1910
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
Location: /v1/conversations/cnv_e6311fc6-e444-471e-abf7-86ffcc23f87e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e6311fc6-e444-471e-abf7-86ffcc23f87e","subject":"Error contract","status":"open","region":"eu","participants":["qa-cbb6a5d771c1","qa-6d0363cd60cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.237955904Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fcf042f9-a069-4c87-bcfd-3c4e454bef5c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a7a235b8-8057-4336-a3a3-b6de301c6897
X-Correlation-Id: qa-fcf042f9-a069-4c87-bcfd-3c4e454bef5c
Content-Type: application/json

--- request body ---
{"handle":"qa-cbb6a5d771c1","password":"****"}

--- response: 503 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcf042f9-a069-4c87-bcfd-3c4e454bef5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-fcf042f9-a069-4c87-bcfd-3c4e454bef5c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b77a4ade-228c-46da-bb75-6b382b5239de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b77a4ade-228c-46da-bb75-6b382b5239de
Content-Type: application/json

--- request body ---
{"handle":"qa-6d0363cd60cb","password":"****"}

--- response: 200 in 59 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b77a4ade-228c-46da-bb75-6b382b5239de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ba06ffb-21d0-4106-876c-68d9df6ed768"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f4d7c73-963f-4446-b2f9-cd8114d594f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f4d7c73-963f-4446-b2f9-cd8114d594f5
Content-Type: application/json

--- response: 204 in 63 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f4d7c73-963f-4446-b2f9-cd8114d594f5
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
correlation: qa-b84709e3-ec50-40c1-a194-0fd4bc0bf5e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b84709e3-ec50-40c1-a194-0fd4bc0bf5e0
Content-Type: application/json

--- request body ---
{"handle":"qa-6d0363cd60cb","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b84709e3-ec50-40c1-a194-0fd4bc0bf5e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b84709e3-ec50-40c1-a194-0fd4bc0bf5e0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03a790bb-224c-4610-9b5a-d2ce07bd6481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03a790bb-224c-4610-9b5a-d2ce07bd6481
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03a790bb-224c-4610-9b5a-d2ce07bd6481
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
correlation: qa-dc5020d8-8798-4635-a8fb-d1338a300c9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc5020d8-8798-4635-a8fb-d1338a300c9b
Content-Type: application/json

--- request body ---
{"handle":"qa-cbb6a5d771c1","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc5020d8-8798-4635-a8fb-d1338a300c9b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc5020d8-8798-4635-a8fb-d1338a300c9b"}
```
