# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-c8371e75-b1b2-4752-894e-bb93c7d0ea29` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-e12cfbc9-6ebf-44bc-9434-c08c5d9dff75` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-20201baf-1006-4ffa-8e48-b5ef1d9c50cc` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-8ccdc707-6b60-4ab4-a033-36af0218dfd0` |
| 5 | `POST /v1/conversations` | 503 | 16 | `qa-9980174c-66ec-47c5-a6d9-0ecdc7b1b7a1` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-c7c904e3-7c11-4528-8a17-96d14153431a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-e873b3d3-9325-4ab1-9db5-89b90323bcfc` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-5e8cbac3-9686-4952-948d-057c2994d4d2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-1692c4f4-0458-4c4c-953a-e103c278dbc5` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-c349d412-0f3b-4acf-9445-6c1112893968` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c8371e75-b1b2-4752-894e-bb93c7d0ea29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8371e75-b1b2-4752-894e-bb93c7d0ea29
Content-Type: application/json

--- request body ---
{"handle":"qa-52378385a771","displayName":"QA 52378385a771","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8371e75-b1b2-4752-894e-bb93c7d0ea29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Location: /v1/accounts/qa-52378385a771
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69694742-144f-40aa-a920-103d73afba22","handle":"qa-52378385a771","displayName":"QA 52378385a771","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.090561436Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e12cfbc9-6ebf-44bc-9434-c08c5d9dff75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e12cfbc9-6ebf-44bc-9434-c08c5d9dff75
Content-Type: application/json

--- request body ---
{"handle":"qa-1119100551b1","displayName":"QA 1119100551b1","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e12cfbc9-6ebf-44bc-9434-c08c5d9dff75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 9
Location: /v1/accounts/qa-1119100551b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41581407-488b-4283-86c3-5298aec033a6","handle":"qa-1119100551b1","displayName":"QA 1119100551b1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.157496585Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-20201baf-1006-4ffa-8e48-b5ef1d9c50cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20201baf-1006-4ffa-8e48-b5ef1d9c50cc
Content-Type: application/json

--- request body ---
{"handle":"qa-52378385a771","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-20201baf-1006-4ffa-8e48-b5ef1d9c50cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69694742-144f-40aa-a920-103d73afba22"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8ccdc707-6b60-4ab4-a033-36af0218dfd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ccdc707-6b60-4ab4-a033-36af0218dfd0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1119100551b1","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ccdc707-6b60-4ab4-a033-36af0218dfd0
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
Location: /v1/conversations/cnv_5ff463ce-8116-4543-b6ee-2b36a0c304c0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5ff463ce-8116-4543-b6ee-2b36a0c304c0","subject":"Error contract","status":"open","region":"eu","participants":["qa-52378385a771","qa-1119100551b1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.229274889Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9980174c-66ec-47c5-a6d9-0ecdc7b1b7a1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3bdbea1b-ec8b-4cff-8c06-d87f59bbfa25
X-Correlation-Id: qa-9980174c-66ec-47c5-a6d9-0ecdc7b1b7a1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-52378385a771","subject":"Probe","message":"Hi"}

--- response: 503 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9980174c-66ec-47c5-a6d9-0ecdc7b1b7a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-9980174c-66ec-47c5-a6d9-0ecdc7b1b7a1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c7c904e3-7c11-4528-8a17-96d14153431a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7c904e3-7c11-4528-8a17-96d14153431a
Content-Type: application/json

--- request body ---
{"handle":"qa-1119100551b1","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7c904e3-7c11-4528-8a17-96d14153431a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41581407-488b-4283-86c3-5298aec033a6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e873b3d3-9325-4ab1-9db5-89b90323bcfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e873b3d3-9325-4ab1-9db5-89b90323bcfc
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e873b3d3-9325-4ab1-9db5-89b90323bcfc
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
correlation: qa-5e8cbac3-9686-4952-948d-057c2994d4d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e8cbac3-9686-4952-948d-057c2994d4d2
Content-Type: application/json

--- request body ---
{"handle":"qa-1119100551b1","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e8cbac3-9686-4952-948d-057c2994d4d2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e8cbac3-9686-4952-948d-057c2994d4d2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1692c4f4-0458-4c4c-953a-e103c278dbc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1692c4f4-0458-4c4c-953a-e103c278dbc5
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1692c4f4-0458-4c4c-953a-e103c278dbc5
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
correlation: qa-c349d412-0f3b-4acf-9445-6c1112893968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c349d412-0f3b-4acf-9445-6c1112893968
Content-Type: application/json

--- request body ---
{"handle":"qa-52378385a771","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c349d412-0f3b-4acf-9445-6c1112893968
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c349d412-0f3b-4acf-9445-6c1112893968"}
```
