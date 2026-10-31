# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-73206524-04fe-4488-9faf-a1fcdb79ce2d` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-4eb24228-fa70-41ac-967d-0b9804c620ee` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-624cb350-b687-4def-9d97-ad6953db8b95` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-9cf7c977-c50d-492e-a6b0-6f09c22f68cb` |
| 5 | `GET /v1/credits/ledger` | 503 | 21 | `qa-590ada1e-c4d4-4050-ae24-d414c98ac64b` |
| 6 | `POST /v1/auth/token` | 200 | 66 | `qa-858cc646-c86e-4b61-b6a6-a93edb82d446` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-72281a2e-e2a8-4730-a7da-087aa4dab6cf` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-8b703008-97b0-4011-b13a-238256733712` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-79e0838f-917c-491a-a15a-f410435de35d` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-8a39238a-ceab-49dc-ae3c-3f223094d63c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73206524-04fe-4488-9faf-a1fcdb79ce2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73206524-04fe-4488-9faf-a1fcdb79ce2d
Content-Type: application/json

--- request body ---
{"handle":"qa-36e9919f2054","displayName":"QA 36e9919f2054","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-73206524-04fe-4488-9faf-a1fcdb79ce2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Location: /v1/accounts/qa-36e9919f2054
X-Served-Region: eu
Content-Length: 181

{"id":"acc_601a882e-496b-451e-804a-7f548eb50335","handle":"qa-36e9919f2054","displayName":"QA 36e9919f2054","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.266093155Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4eb24228-fa70-41ac-967d-0b9804c620ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eb24228-fa70-41ac-967d-0b9804c620ee
Content-Type: application/json

--- request body ---
{"handle":"qa-8f077ab4dd80","displayName":"QA 8f077ab4dd80","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4eb24228-fa70-41ac-967d-0b9804c620ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Location: /v1/accounts/qa-8f077ab4dd80
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e05e8ee-1acc-4420-af08-ec946878cc07","handle":"qa-8f077ab4dd80","displayName":"QA 8f077ab4dd80","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.317945368Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-624cb350-b687-4def-9d97-ad6953db8b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-624cb350-b687-4def-9d97-ad6953db8b95
Content-Type: application/json

--- request body ---
{"handle":"qa-36e9919f2054","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-624cb350-b687-4def-9d97-ad6953db8b95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_601a882e-496b-451e-804a-7f548eb50335"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9cf7c977-c50d-492e-a6b0-6f09c22f68cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cf7c977-c50d-492e-a6b0-6f09c22f68cb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f077ab4dd80","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cf7c977-c50d-492e-a6b0-6f09c22f68cb
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
Location: /v1/conversations/cnv_c6dd4705-e94a-471d-894e-778f43f911bb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c6dd4705-e94a-471d-894e-778f43f911bb","subject":"Error contract","status":"open","region":"eu","participants":["qa-36e9919f2054","qa-8f077ab4dd80"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.391947050Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-590ada1e-c4d4-4050-ae24-d414c98ac64b

--- request headers ---
Accept: application/json
X-Fault-Key: afe494ee-172c-4d38-88ea-146441229a0e
X-Fault: unavailable-once
X-Correlation-Id: qa-590ada1e-c4d4-4050-ae24-d414c98ac64b
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-590ada1e-c4d4-4050-ae24-d414c98ac64b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-590ada1e-c4d4-4050-ae24-d414c98ac64b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-858cc646-c86e-4b61-b6a6-a93edb82d446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-858cc646-c86e-4b61-b6a6-a93edb82d446
Content-Type: application/json

--- request body ---
{"handle":"qa-8f077ab4dd80","password":"****"}

--- response: 200 in 66 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-858cc646-c86e-4b61-b6a6-a93edb82d446
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e05e8ee-1acc-4420-af08-ec946878cc07"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72281a2e-e2a8-4730-a7da-087aa4dab6cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72281a2e-e2a8-4730-a7da-087aa4dab6cf
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72281a2e-e2a8-4730-a7da-087aa4dab6cf
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
correlation: qa-8b703008-97b0-4011-b13a-238256733712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b703008-97b0-4011-b13a-238256733712
Content-Type: application/json

--- request body ---
{"handle":"qa-8f077ab4dd80","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b703008-97b0-4011-b13a-238256733712
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b703008-97b0-4011-b13a-238256733712"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79e0838f-917c-491a-a15a-f410435de35d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79e0838f-917c-491a-a15a-f410435de35d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79e0838f-917c-491a-a15a-f410435de35d
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
correlation: qa-8a39238a-ceab-49dc-ae3c-3f223094d63c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a39238a-ceab-49dc-ae3c-3f223094d63c
Content-Type: application/json

--- request body ---
{"handle":"qa-36e9919f2054","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a39238a-ceab-49dc-ae3c-3f223094d63c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a39238a-ceab-49dc-ae3c-3f223094d63c"}
```
