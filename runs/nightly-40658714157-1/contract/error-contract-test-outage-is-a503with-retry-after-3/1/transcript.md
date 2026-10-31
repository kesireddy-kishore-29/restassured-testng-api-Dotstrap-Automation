# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-be2df1ba-87e6-483f-be3c-9683ce5eb0d5` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-bea6ec10-ca8d-4ac2-8a3d-b15ea303904d` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-a7f68837-a3a8-4a8f-a52b-62c59e670ccc` |
| 4 | `POST /v1/conversations` | 201 | 2 | `qa-66145a66-8d79-4bdd-86a9-a29ff05c573c` |
| 5 | `PATCH /v1/accounts/me` | 503 | 14 | `qa-3d319198-cb56-4524-a85e-77d6fd65a38a` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-1705562e-72be-489d-a7a9-d7ec9bca59ed` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-04502df1-9b08-45d7-bceb-6e94c567a1da` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-85d14dcb-2391-4098-a18f-ab0fd8ebd542` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-d652bb88-bf76-4bc2-bb10-9c46c0dbb4a9` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-c29cd95a-f3d1-45cb-9e34-4d0a56489ac2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-be2df1ba-87e6-483f-be3c-9683ce5eb0d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be2df1ba-87e6-483f-be3c-9683ce5eb0d5
Content-Type: application/json

--- request body ---
{"handle":"qa-e12d2a162282","displayName":"QA e12d2a162282","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-be2df1ba-87e6-483f-be3c-9683ce5eb0d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-e12d2a162282
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74ab3995-0106-4bea-bd84-2a3258e0620d","handle":"qa-e12d2a162282","displayName":"QA e12d2a162282","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.373726038Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bea6ec10-ca8d-4ac2-8a3d-b15ea303904d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea6ec10-ca8d-4ac2-8a3d-b15ea303904d
Content-Type: application/json

--- request body ---
{"handle":"qa-b7579eb84a7b","displayName":"QA b7579eb84a7b","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-bea6ec10-ca8d-4ac2-8a3d-b15ea303904d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Location: /v1/accounts/qa-b7579eb84a7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37968519-886e-408d-a039-f4779cf1b6e9","handle":"qa-b7579eb84a7b","displayName":"QA b7579eb84a7b","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.441233484Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7f68837-a3a8-4a8f-a52b-62c59e670ccc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7f68837-a3a8-4a8f-a52b-62c59e670ccc
Content-Type: application/json

--- request body ---
{"handle":"qa-e12d2a162282","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7f68837-a3a8-4a8f-a52b-62c59e670ccc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74ab3995-0106-4bea-bd84-2a3258e0620d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-66145a66-8d79-4bdd-86a9-a29ff05c573c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66145a66-8d79-4bdd-86a9-a29ff05c573c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b7579eb84a7b","subject":"Error contract","message":"Hi"}

--- response: 201 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-66145a66-8d79-4bdd-86a9-a29ff05c573c
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
Location: /v1/conversations/cnv_801a651f-e4bd-4b80-9abf-4aa665e5acd9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_801a651f-e4bd-4b80-9abf-4aa665e5acd9","subject":"Error contract","status":"open","region":"eu","participants":["qa-e12d2a162282","qa-b7579eb84a7b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.488677432Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-3d319198-cb56-4524-a85e-77d6fd65a38a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f852f602-04c5-4254-99b2-e305bcb4c839
X-Correlation-Id: qa-3d319198-cb56-4524-a85e-77d6fd65a38a
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d319198-cb56-4524-a85e-77d6fd65a38a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3d319198-cb56-4524-a85e-77d6fd65a38a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1705562e-72be-489d-a7a9-d7ec9bca59ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1705562e-72be-489d-a7a9-d7ec9bca59ed
Content-Type: application/json

--- request body ---
{"handle":"qa-b7579eb84a7b","password":"****"}

--- response: 200 in 50 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1705562e-72be-489d-a7a9-d7ec9bca59ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37968519-886e-408d-a039-f4779cf1b6e9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04502df1-9b08-45d7-bceb-6e94c567a1da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04502df1-9b08-45d7-bceb-6e94c567a1da
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04502df1-9b08-45d7-bceb-6e94c567a1da
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
correlation: qa-85d14dcb-2391-4098-a18f-ab0fd8ebd542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85d14dcb-2391-4098-a18f-ab0fd8ebd542
Content-Type: application/json

--- request body ---
{"handle":"qa-b7579eb84a7b","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85d14dcb-2391-4098-a18f-ab0fd8ebd542
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85d14dcb-2391-4098-a18f-ab0fd8ebd542"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d652bb88-bf76-4bc2-bb10-9c46c0dbb4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d652bb88-bf76-4bc2-bb10-9c46c0dbb4a9
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d652bb88-bf76-4bc2-bb10-9c46c0dbb4a9
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
correlation: qa-c29cd95a-f3d1-45cb-9e34-4d0a56489ac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c29cd95a-f3d1-45cb-9e34-4d0a56489ac2
Content-Type: application/json

--- request body ---
{"handle":"qa-e12d2a162282","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c29cd95a-f3d1-45cb-9e34-4d0a56489ac2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c29cd95a-f3d1-45cb-9e34-4d0a56489ac2"}
```
