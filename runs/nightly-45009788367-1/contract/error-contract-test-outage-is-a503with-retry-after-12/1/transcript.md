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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-1d0a6fb8-6b98-4ddb-80a2-a4cf6b0bba3d` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-826940c9-71b7-4d37-9816-f3b09f3f63fe` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-439d974c-38f7-4e1c-aa0e-685c48033ddb` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-e56fea70-e9b3-48dd-bc98-b52637c7355c` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 16 | `qa-1df4d09a-91ac-492c-9379-e14e5f3bf8ae` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-e2d3a94c-8f13-4f83-a9c1-02e2256bf905` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-14a9cfff-f0d4-4192-86f6-d99000d62f8f` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-b33b5338-10c0-4cd6-93fe-f17b3865bbe5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-a6c5584c-c35d-4826-9a38-ac7663a491fb` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-bff58386-3fda-4b3b-be19-e7db06083a23` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d0a6fb8-6b98-4ddb-80a2-a4cf6b0bba3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d0a6fb8-6b98-4ddb-80a2-a4cf6b0bba3d
Content-Type: application/json

--- request body ---
{"handle":"qa-ef480599e679","displayName":"QA ef480599e679","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d0a6fb8-6b98-4ddb-80a2-a4cf6b0bba3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Location: /v1/accounts/qa-ef480599e679
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6636bb7-a1d7-44da-91ae-003cdecdb440","handle":"qa-ef480599e679","displayName":"QA ef480599e679","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.999921758Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-826940c9-71b7-4d37-9816-f3b09f3f63fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-826940c9-71b7-4d37-9816-f3b09f3f63fe
Content-Type: application/json

--- request body ---
{"handle":"qa-c06346edaa59","displayName":"QA c06346edaa59","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-826940c9-71b7-4d37-9816-f3b09f3f63fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Location: /v1/accounts/qa-c06346edaa59
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03c1a9da-9aa8-4ec4-9b13-ecd7f3e34a5b","handle":"qa-c06346edaa59","displayName":"QA c06346edaa59","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.029629033Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-439d974c-38f7-4e1c-aa0e-685c48033ddb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-439d974c-38f7-4e1c-aa0e-685c48033ddb
Content-Type: application/json

--- request body ---
{"handle":"qa-ef480599e679","password":"****"}

--- response: 200 in 46 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-439d974c-38f7-4e1c-aa0e-685c48033ddb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6636bb7-a1d7-44da-91ae-003cdecdb440"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e56fea70-e9b3-48dd-bc98-b52637c7355c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e56fea70-e9b3-48dd-bc98-b52637c7355c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c06346edaa59","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e56fea70-e9b3-48dd-bc98-b52637c7355c
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
Location: /v1/conversations/cnv_5de8258f-e75e-48a2-8d2c-571aebb0f845
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5de8258f-e75e-48a2-8d2c-571aebb0f845","subject":"Error contract","status":"open","region":"eu","participants":["qa-ef480599e679","qa-c06346edaa59"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.102060916Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5de8258f-e75e-48a2-8d2c-571aebb0f845/close
correlation: qa-1df4d09a-91ac-492c-9379-e14e5f3bf8ae

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4ea10f13-ce8b-441e-bc51-a079608aaa63
X-Correlation-Id: qa-1df4d09a-91ac-492c-9379-e14e5f3bf8ae
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1df4d09a-91ac-492c-9379-e14e5f3bf8ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_5de8258f-e75e-48a2-8d2c-571aebb0f845/close","correlationId":"qa-1df4d09a-91ac-492c-9379-e14e5f3bf8ae"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e2d3a94c-8f13-4f83-a9c1-02e2256bf905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2d3a94c-8f13-4f83-a9c1-02e2256bf905
Content-Type: application/json

--- request body ---
{"handle":"qa-c06346edaa59","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2d3a94c-8f13-4f83-a9c1-02e2256bf905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03c1a9da-9aa8-4ec4-9b13-ecd7f3e34a5b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14a9cfff-f0d4-4192-86f6-d99000d62f8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14a9cfff-f0d4-4192-86f6-d99000d62f8f
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14a9cfff-f0d4-4192-86f6-d99000d62f8f
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
correlation: qa-b33b5338-10c0-4cd6-93fe-f17b3865bbe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b33b5338-10c0-4cd6-93fe-f17b3865bbe5
Content-Type: application/json

--- request body ---
{"handle":"qa-c06346edaa59","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b33b5338-10c0-4cd6-93fe-f17b3865bbe5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b33b5338-10c0-4cd6-93fe-f17b3865bbe5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6c5584c-c35d-4826-9a38-ac7663a491fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c5584c-c35d-4826-9a38-ac7663a491fb
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6c5584c-c35d-4826-9a38-ac7663a491fb
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
correlation: qa-bff58386-3fda-4b3b-be19-e7db06083a23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bff58386-3fda-4b3b-be19-e7db06083a23
Content-Type: application/json

--- request body ---
{"handle":"qa-ef480599e679","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bff58386-3fda-4b3b-be19-e7db06083a23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bff58386-3fda-4b3b-be19-e7db06083a23"}
```
