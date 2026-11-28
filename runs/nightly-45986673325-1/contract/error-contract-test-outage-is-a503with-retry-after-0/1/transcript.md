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
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-bac12aae-5e66-4ba3-8578-409d114def6d` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-0ef7fe91-d5d6-4f88-a3b0-f4470607a573` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-e7be4119-00a1-4d93-af76-3e15764d570e` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-97d60e5b-bd24-47ee-af8b-a9279c7894c6` |
| 5 | `POST /v1/auth/token` | 503 | 18 | `qa-ed7b5d2e-5b0d-4321-a9aa-a339a847b5cd` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-3032be04-6d70-4c2c-a9bc-f8b879f02486` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-cfb00830-139c-4822-8b01-366fb31614cd` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-c8863af5-aefc-44e8-a745-354c1f32b52d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-6c0665f3-ad7a-4e92-9442-bbb44b3fec7e` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-e198993a-9609-4bf2-b4fc-1d50f2f21969` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bac12aae-5e66-4ba3-8578-409d114def6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac12aae-5e66-4ba3-8578-409d114def6d
Content-Type: application/json

--- request body ---
{"handle":"qa-47c02e91d45b","displayName":"QA 47c02e91d45b","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bac12aae-5e66-4ba3-8578-409d114def6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-47c02e91d45b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b03caa8-5656-43ac-b7e0-4d286ee4bef0","handle":"qa-47c02e91d45b","displayName":"QA 47c02e91d45b","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.006870912Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0ef7fe91-d5d6-4f88-a3b0-f4470607a573

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ef7fe91-d5d6-4f88-a3b0-f4470607a573
Content-Type: application/json

--- request body ---
{"handle":"qa-b13fadc022f6","displayName":"QA b13fadc022f6","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ef7fe91-d5d6-4f88-a3b0-f4470607a573
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Location: /v1/accounts/qa-b13fadc022f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b13788f9-4b81-47ea-b8a5-06800cde7dd8","handle":"qa-b13fadc022f6","displayName":"QA b13fadc022f6","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.071743300Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e7be4119-00a1-4d93-af76-3e15764d570e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7be4119-00a1-4d93-af76-3e15764d570e
Content-Type: application/json

--- request body ---
{"handle":"qa-47c02e91d45b","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7be4119-00a1-4d93-af76-3e15764d570e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b03caa8-5656-43ac-b7e0-4d286ee4bef0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-97d60e5b-bd24-47ee-af8b-a9279c7894c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97d60e5b-bd24-47ee-af8b-a9279c7894c6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b13fadc022f6","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-97d60e5b-bd24-47ee-af8b-a9279c7894c6
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
Location: /v1/conversations/cnv_f56441b6-1a44-4cc3-828b-1447143888d9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f56441b6-1a44-4cc3-828b-1447143888d9","subject":"Error contract","status":"open","region":"eu","participants":["qa-47c02e91d45b","qa-b13fadc022f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.169896710Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ed7b5d2e-5b0d-4321-a9aa-a339a847b5cd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e6d4563b-5c90-4fe2-8bc1-3ff3c560d4c1
X-Correlation-Id: qa-ed7b5d2e-5b0d-4321-a9aa-a339a847b5cd
Content-Type: application/json

--- request body ---
{"handle":"qa-47c02e91d45b","password":"****"}

--- response: 503 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed7b5d2e-5b0d-4321-a9aa-a339a847b5cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-ed7b5d2e-5b0d-4321-a9aa-a339a847b5cd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3032be04-6d70-4c2c-a9bc-f8b879f02486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3032be04-6d70-4c2c-a9bc-f8b879f02486
Content-Type: application/json

--- request body ---
{"handle":"qa-b13fadc022f6","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3032be04-6d70-4c2c-a9bc-f8b879f02486
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b13788f9-4b81-47ea-b8a5-06800cde7dd8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfb00830-139c-4822-8b01-366fb31614cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb00830-139c-4822-8b01-366fb31614cd
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfb00830-139c-4822-8b01-366fb31614cd
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
correlation: qa-c8863af5-aefc-44e8-a745-354c1f32b52d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8863af5-aefc-44e8-a745-354c1f32b52d
Content-Type: application/json

--- request body ---
{"handle":"qa-b13fadc022f6","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8863af5-aefc-44e8-a745-354c1f32b52d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8863af5-aefc-44e8-a745-354c1f32b52d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c0665f3-ad7a-4e92-9442-bbb44b3fec7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c0665f3-ad7a-4e92-9442-bbb44b3fec7e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c0665f3-ad7a-4e92-9442-bbb44b3fec7e
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
correlation: qa-e198993a-9609-4bf2-b4fc-1d50f2f21969

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e198993a-9609-4bf2-b4fc-1d50f2f21969
Content-Type: application/json

--- request body ---
{"handle":"qa-47c02e91d45b","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e198993a-9609-4bf2-b4fc-1d50f2f21969
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e198993a-9609-4bf2-b4fc-1d50f2f21969"}
```
