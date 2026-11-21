# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-1c13ab79-b539-465a-b6f9-3adc40665da7` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-e37b47db-4fcd-4e43-9ad5-29455b706847` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-ee383aef-e9fb-4f52-a4eb-60b587348ec9` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-4e8529c6-93a2-4693-8e51-3708402c9a58` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 6 | `qa-52d6cce4-e952-4a7d-afdc-a391a981e09c` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-793e3185-cafd-4fa5-a60c-12d59a0d2a4d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 65 | `qa-2b929bd1-5b5c-4537-93bb-8926d5d643d1` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-4d90ddef-408c-4d4d-98e2-cd5b1dd01100` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d831626a-5a49-438b-8977-5d57e9db8ee4` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-1c08368b-142f-4e5b-a72a-308e2b50a665` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c13ab79-b539-465a-b6f9-3adc40665da7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c13ab79-b539-465a-b6f9-3adc40665da7
Content-Type: application/json

--- request body ---
{"handle":"qa-5c21378b04fb","displayName":"QA 5c21378b04fb","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c13ab79-b539-465a-b6f9-3adc40665da7
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
Location: /v1/accounts/qa-5c21378b04fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c3cefb4-83f1-4426-9b30-70147d3a945c","handle":"qa-5c21378b04fb","displayName":"QA 5c21378b04fb","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.496823997Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e37b47db-4fcd-4e43-9ad5-29455b706847

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e37b47db-4fcd-4e43-9ad5-29455b706847
Content-Type: application/json

--- request body ---
{"handle":"qa-49cc3683287e","displayName":"QA 49cc3683287e","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e37b47db-4fcd-4e43-9ad5-29455b706847
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-49cc3683287e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4c4a59e-b669-4a0b-9792-792b1eec8668","handle":"qa-49cc3683287e","displayName":"QA 49cc3683287e","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.534495090Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ee383aef-e9fb-4f52-a4eb-60b587348ec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee383aef-e9fb-4f52-a4eb-60b587348ec9
Content-Type: application/json

--- request body ---
{"handle":"qa-5c21378b04fb","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee383aef-e9fb-4f52-a4eb-60b587348ec9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c3cefb4-83f1-4426-9b30-70147d3a945c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4e8529c6-93a2-4693-8e51-3708402c9a58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e8529c6-93a2-4693-8e51-3708402c9a58
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-49cc3683287e","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e8529c6-93a2-4693-8e51-3708402c9a58
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
Location: /v1/conversations/cnv_8d6232c9-a416-4885-9f66-1e9c73711dfa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8d6232c9-a416-4885-9f66-1e9c73711dfa","subject":"Error contract","status":"open","region":"eu","participants":["qa-5c21378b04fb","qa-49cc3683287e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.590521702Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8d6232c9-a416-4885-9f66-1e9c73711dfa/read
correlation: qa-52d6cce4-e952-4a7d-afdc-a391a981e09c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 050acb9a-fae8-4ca7-a497-f10404ebf597
X-Correlation-Id: qa-52d6cce4-e952-4a7d-afdc-a391a981e09c
Content-Type: application/json

--- response: 503 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52d6cce4-e952-4a7d-afdc-a391a981e09c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_8d6232c9-a416-4885-9f66-1e9c73711dfa/read","correlationId":"qa-52d6cce4-e952-4a7d-afdc-a391a981e09c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-793e3185-cafd-4fa5-a60c-12d59a0d2a4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793e3185-cafd-4fa5-a60c-12d59a0d2a4d
Content-Type: application/json

--- request body ---
{"handle":"qa-49cc3683287e","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-793e3185-cafd-4fa5-a60c-12d59a0d2a4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4c4a59e-b669-4a0b-9792-792b1eec8668"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b929bd1-5b5c-4537-93bb-8926d5d643d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b929bd1-5b5c-4537-93bb-8926d5d643d1
Content-Type: application/json

--- response: 204 in 65 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b929bd1-5b5c-4537-93bb-8926d5d643d1
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
correlation: qa-4d90ddef-408c-4d4d-98e2-cd5b1dd01100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d90ddef-408c-4d4d-98e2-cd5b1dd01100
Content-Type: application/json

--- request body ---
{"handle":"qa-49cc3683287e","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d90ddef-408c-4d4d-98e2-cd5b1dd01100
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d90ddef-408c-4d4d-98e2-cd5b1dd01100"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d831626a-5a49-438b-8977-5d57e9db8ee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d831626a-5a49-438b-8977-5d57e9db8ee4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d831626a-5a49-438b-8977-5d57e9db8ee4
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
correlation: qa-1c08368b-142f-4e5b-a72a-308e2b50a665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c08368b-142f-4e5b-a72a-308e2b50a665
Content-Type: application/json

--- request body ---
{"handle":"qa-5c21378b04fb","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c08368b-142f-4e5b-a72a-308e2b50a665
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c08368b-142f-4e5b-a72a-308e2b50a665"}
```
