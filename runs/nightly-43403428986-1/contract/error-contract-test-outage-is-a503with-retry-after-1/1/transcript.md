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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-2c11c3de-5762-4e77-961c-677e31ed50e2` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-d56df8ed-38fd-4be1-93d5-2f1e9416cf25` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-b232c1c2-64ce-4815-aa4c-2398966300a5` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-7795eb8e-99e4-4f42-9293-a50efdcc0767` |
| 5 | `POST /v1/accounts` | 503 | 15 | `qa-9e327316-46a6-4d5e-ab17-f4a683409afb` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-d03f0503-8540-40b8-b042-51ad92dc1883` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-b6a4deb4-ec91-40c1-91b8-18d4dd2b24f0` |
| 8 | `POST /v1/auth/token` | 401 | 49 | `qa-d474516f-939a-4c1b-8255-7c6840e13a49` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-7697094a-250a-4353-af3e-5291d57fe53a` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-c0faaae8-b145-4ace-b285-4990ed60f4fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c11c3de-5762-4e77-961c-677e31ed50e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c11c3de-5762-4e77-961c-677e31ed50e2
Content-Type: application/json

--- request body ---
{"handle":"qa-5d05c8a0c97a","displayName":"QA 5d05c8a0c97a","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c11c3de-5762-4e77-961c-677e31ed50e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-5d05c8a0c97a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8207976c-386d-4205-9c82-1e56824b627b","handle":"qa-5d05c8a0c97a","displayName":"QA 5d05c8a0c97a","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.597766007Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d56df8ed-38fd-4be1-93d5-2f1e9416cf25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d56df8ed-38fd-4be1-93d5-2f1e9416cf25
Content-Type: application/json

--- request body ---
{"handle":"qa-5ff0ade5b4cf","displayName":"QA 5ff0ade5b4cf","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d56df8ed-38fd-4be1-93d5-2f1e9416cf25
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
Location: /v1/accounts/qa-5ff0ade5b4cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d538534-6090-419f-8a9a-365468af5c00","handle":"qa-5ff0ade5b4cf","displayName":"QA 5ff0ade5b4cf","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.658852326Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b232c1c2-64ce-4815-aa4c-2398966300a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b232c1c2-64ce-4815-aa4c-2398966300a5
Content-Type: application/json

--- request body ---
{"handle":"qa-5d05c8a0c97a","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b232c1c2-64ce-4815-aa4c-2398966300a5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8207976c-386d-4205-9c82-1e56824b627b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7795eb8e-99e4-4f42-9293-a50efdcc0767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7795eb8e-99e4-4f42-9293-a50efdcc0767
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ff0ade5b4cf","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-7795eb8e-99e4-4f42-9293-a50efdcc0767
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
Location: /v1/conversations/cnv_f5241651-3174-4cc3-b102-784015af5c73
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f5241651-3174-4cc3-b102-784015af5c73","subject":"Error contract","status":"open","region":"eu","participants":["qa-5d05c8a0c97a","qa-5ff0ade5b4cf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.756468297Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-9e327316-46a6-4d5e-ab17-f4a683409afb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 21598e82-70ed-4608-b20c-f9681cfc5b98
X-Correlation-Id: qa-9e327316-46a6-4d5e-ab17-f4a683409afb
Content-Type: application/json

--- request body ---
{"handle":"qa-040b71d27ac2","displayName":"QA 040b71d27ac2","password":"****","region":"eu"}

--- response: 503 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e327316-46a6-4d5e-ab17-f4a683409afb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-9e327316-46a6-4d5e-ab17-f4a683409afb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d03f0503-8540-40b8-b042-51ad92dc1883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d03f0503-8540-40b8-b042-51ad92dc1883
Content-Type: application/json

--- request body ---
{"handle":"qa-5ff0ade5b4cf","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d03f0503-8540-40b8-b042-51ad92dc1883
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d538534-6090-419f-8a9a-365468af5c00"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6a4deb4-ec91-40c1-91b8-18d4dd2b24f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6a4deb4-ec91-40c1-91b8-18d4dd2b24f0
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6a4deb4-ec91-40c1-91b8-18d4dd2b24f0
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
correlation: qa-d474516f-939a-4c1b-8255-7c6840e13a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d474516f-939a-4c1b-8255-7c6840e13a49
Content-Type: application/json

--- request body ---
{"handle":"qa-5ff0ade5b4cf","password":"****"}

--- response: 401 in 49 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d474516f-939a-4c1b-8255-7c6840e13a49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d474516f-939a-4c1b-8255-7c6840e13a49"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7697094a-250a-4353-af3e-5291d57fe53a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7697094a-250a-4353-af3e-5291d57fe53a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7697094a-250a-4353-af3e-5291d57fe53a
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
correlation: qa-c0faaae8-b145-4ace-b285-4990ed60f4fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0faaae8-b145-4ace-b285-4990ed60f4fc
Content-Type: application/json

--- request body ---
{"handle":"qa-5d05c8a0c97a","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0faaae8-b145-4ace-b285-4990ed60f4fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0faaae8-b145-4ace-b285-4990ed60f4fc"}
```
