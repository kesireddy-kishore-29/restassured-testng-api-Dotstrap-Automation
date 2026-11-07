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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-a1228a60-48d3-4ef6-8b37-94cad96b3ead` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-05eda8e7-da4c-42bb-ba41-c68a5a63a086` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-d407fb60-f1d3-4e8e-bc6d-881c7a256d43` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-53d8e591-fbf0-437b-8df6-185d9c437620` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 10 | `qa-3b9ee65d-6c12-4c86-b3e1-72814c91fe3e` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-fe70e222-598c-490b-ac24-3893bd02bcd9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-50229777-0331-4fd7-94f7-fab68f8636d8` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-2bfb93b7-37b1-4c89-a201-d81600a5bede` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-bad63d30-2ca9-42e8-85cf-6f66bb15f6b8` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-f7570332-736b-4aad-b6d6-6f5fcf88ad3c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a1228a60-48d3-4ef6-8b37-94cad96b3ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1228a60-48d3-4ef6-8b37-94cad96b3ead
Content-Type: application/json

--- request body ---
{"handle":"qa-29515ee01ad4","displayName":"QA 29515ee01ad4","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1228a60-48d3-4ef6-8b37-94cad96b3ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Location: /v1/accounts/qa-29515ee01ad4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbac1d75-3812-4b1a-b33f-209a2553bc9e","handle":"qa-29515ee01ad4","displayName":"QA 29515ee01ad4","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.090870126Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05eda8e7-da4c-42bb-ba41-c68a5a63a086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05eda8e7-da4c-42bb-ba41-c68a5a63a086
Content-Type: application/json

--- request body ---
{"handle":"qa-cc958e2f9e4c","displayName":"QA cc958e2f9e4c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-05eda8e7-da4c-42bb-ba41-c68a5a63a086
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Location: /v1/accounts/qa-cc958e2f9e4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_013db8f4-645b-48b0-b78e-7a24bf934b42","handle":"qa-cc958e2f9e4c","displayName":"QA cc958e2f9e4c","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.126732272Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d407fb60-f1d3-4e8e-bc6d-881c7a256d43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d407fb60-f1d3-4e8e-bc6d-881c7a256d43
Content-Type: application/json

--- request body ---
{"handle":"qa-29515ee01ad4","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d407fb60-f1d3-4e8e-bc6d-881c7a256d43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbac1d75-3812-4b1a-b33f-209a2553bc9e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-53d8e591-fbf0-437b-8df6-185d9c437620

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d8e591-fbf0-437b-8df6-185d9c437620
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cc958e2f9e4c","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-53d8e591-fbf0-437b-8df6-185d9c437620
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
Location: /v1/conversations/cnv_75f2ec26-d487-40d6-9c8d-2e6657a42915
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_75f2ec26-d487-40d6-9c8d-2e6657a42915","subject":"Error contract","status":"open","region":"eu","participants":["qa-29515ee01ad4","qa-cc958e2f9e4c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.208441815Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_75f2ec26-d487-40d6-9c8d-2e6657a42915/close
correlation: qa-3b9ee65d-6c12-4c86-b3e1-72814c91fe3e

--- request headers ---
Accept: application/json
X-Fault-Key: 2cde3acf-0941-4a47-b2d2-b1530bba3d20
X-Fault: unavailable-once
X-Correlation-Id: qa-3b9ee65d-6c12-4c86-b3e1-72814c91fe3e
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b9ee65d-6c12-4c86-b3e1-72814c91fe3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_75f2ec26-d487-40d6-9c8d-2e6657a42915/close","correlationId":"qa-3b9ee65d-6c12-4c86-b3e1-72814c91fe3e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fe70e222-598c-490b-ac24-3893bd02bcd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe70e222-598c-490b-ac24-3893bd02bcd9
Content-Type: application/json

--- request body ---
{"handle":"qa-cc958e2f9e4c","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe70e222-598c-490b-ac24-3893bd02bcd9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_013db8f4-645b-48b0-b78e-7a24bf934b42"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50229777-0331-4fd7-94f7-fab68f8636d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50229777-0331-4fd7-94f7-fab68f8636d8
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50229777-0331-4fd7-94f7-fab68f8636d8
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
correlation: qa-2bfb93b7-37b1-4c89-a201-d81600a5bede

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bfb93b7-37b1-4c89-a201-d81600a5bede
Content-Type: application/json

--- request body ---
{"handle":"qa-cc958e2f9e4c","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bfb93b7-37b1-4c89-a201-d81600a5bede
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bfb93b7-37b1-4c89-a201-d81600a5bede"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bad63d30-2ca9-42e8-85cf-6f66bb15f6b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bad63d30-2ca9-42e8-85cf-6f66bb15f6b8
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bad63d30-2ca9-42e8-85cf-6f66bb15f6b8
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
correlation: qa-f7570332-736b-4aad-b6d6-6f5fcf88ad3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7570332-736b-4aad-b6d6-6f5fcf88ad3c
Content-Type: application/json

--- request body ---
{"handle":"qa-29515ee01ad4","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7570332-736b-4aad-b6d6-6f5fcf88ad3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7570332-736b-4aad-b6d6-6f5fcf88ad3c"}
```
