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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-027fa8c5-dcaa-4884-8e90-ddd88dd05db9` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-6d8a2d60-14fe-44db-b15a-af9706792b4d` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-22ae32c5-f423-44a0-bc55-6c86e18e9244` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-ef36cda6-aa20-491f-8a94-7c0597a34693` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 17 | `qa-807ef0ec-b46a-44ba-8620-6c346d1fa9f5` |
| 6 | `POST /v1/auth/token` | 200 | 69 | `qa-3766a063-1abf-4aee-af8c-170f52382b3c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-7e1be262-9f9e-4e8d-849f-9e8860ce885f` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-9a7d947a-4c8d-463b-91a6-a109e1bd26e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-7314b680-5520-4683-8bce-9475a01ea943` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-03734851-2199-48e1-a680-8a6f06b76816` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-027fa8c5-dcaa-4884-8e90-ddd88dd05db9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-027fa8c5-dcaa-4884-8e90-ddd88dd05db9
Content-Type: application/json

--- request body ---
{"handle":"qa-a05a3f9f4d99","displayName":"QA a05a3f9f4d99","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-027fa8c5-dcaa-4884-8e90-ddd88dd05db9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Location: /v1/accounts/qa-a05a3f9f4d99
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d664a25-a0a0-40f4-8d06-f33b678d5615","handle":"qa-a05a3f9f4d99","displayName":"QA a05a3f9f4d99","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.226619229Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6d8a2d60-14fe-44db-b15a-af9706792b4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d8a2d60-14fe-44db-b15a-af9706792b4d
Content-Type: application/json

--- request body ---
{"handle":"qa-a40fef49a536","displayName":"QA a40fef49a536","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d8a2d60-14fe-44db-b15a-af9706792b4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Location: /v1/accounts/qa-a40fef49a536
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45f54de8-4dcf-4f57-abf3-5a1867b6f41e","handle":"qa-a40fef49a536","displayName":"QA a40fef49a536","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.300349387Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-22ae32c5-f423-44a0-bc55-6c86e18e9244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22ae32c5-f423-44a0-bc55-6c86e18e9244
Content-Type: application/json

--- request body ---
{"handle":"qa-a05a3f9f4d99","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-22ae32c5-f423-44a0-bc55-6c86e18e9244
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d664a25-a0a0-40f4-8d06-f33b678d5615"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ef36cda6-aa20-491f-8a94-7c0597a34693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef36cda6-aa20-491f-8a94-7c0597a34693
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a40fef49a536","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef36cda6-aa20-491f-8a94-7c0597a34693
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
Location: /v1/conversations/cnv_ed5cd15d-98f2-4e85-8247-a9040263cf2e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ed5cd15d-98f2-4e85-8247-a9040263cf2e","subject":"Error contract","status":"open","region":"eu","participants":["qa-a05a3f9f4d99","qa-a40fef49a536"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.371188375Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ed5cd15d-98f2-4e85-8247-a9040263cf2e/close
correlation: qa-807ef0ec-b46a-44ba-8620-6c346d1fa9f5

--- request headers ---
Accept: application/json
X-Fault-Key: 0a40e21e-baf1-4320-9186-e875fed1de9b
X-Fault: unavailable-once
X-Correlation-Id: qa-807ef0ec-b46a-44ba-8620-6c346d1fa9f5
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-807ef0ec-b46a-44ba-8620-6c346d1fa9f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ed5cd15d-98f2-4e85-8247-a9040263cf2e/close","correlationId":"qa-807ef0ec-b46a-44ba-8620-6c346d1fa9f5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3766a063-1abf-4aee-af8c-170f52382b3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3766a063-1abf-4aee-af8c-170f52382b3c
Content-Type: application/json

--- request body ---
{"handle":"qa-a40fef49a536","password":"****"}

--- response: 200 in 69 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3766a063-1abf-4aee-af8c-170f52382b3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45f54de8-4dcf-4f57-abf3-5a1867b6f41e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e1be262-9f9e-4e8d-849f-9e8860ce885f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e1be262-9f9e-4e8d-849f-9e8860ce885f
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e1be262-9f9e-4e8d-849f-9e8860ce885f
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
correlation: qa-9a7d947a-4c8d-463b-91a6-a109e1bd26e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a7d947a-4c8d-463b-91a6-a109e1bd26e5
Content-Type: application/json

--- request body ---
{"handle":"qa-a40fef49a536","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a7d947a-4c8d-463b-91a6-a109e1bd26e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a7d947a-4c8d-463b-91a6-a109e1bd26e5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7314b680-5520-4683-8bce-9475a01ea943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7314b680-5520-4683-8bce-9475a01ea943
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7314b680-5520-4683-8bce-9475a01ea943
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
correlation: qa-03734851-2199-48e1-a680-8a6f06b76816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03734851-2199-48e1-a680-8a6f06b76816
Content-Type: application/json

--- request body ---
{"handle":"qa-a05a3f9f4d99","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03734851-2199-48e1-a680-8a6f06b76816
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03734851-2199-48e1-a680-8a6f06b76816"}
```
