# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-4f1dc13b-0b4b-4868-9651-c18380dbecdc` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-2e6279d1-89fb-4170-ac87-0cf4737049e2` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-0e3dda0d-6dd4-4799-813d-a0aab3b8f6ca` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-a31c88d3-9403-404f-9029-31b18d64575a` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 19 | `qa-b901fc15-8c3b-4987-9b8a-9579be846e5c` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-16f358f0-80fa-4337-bd54-530055bace28` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-7380611b-0fe1-452e-8413-5f23fd9f5bbd` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-52050bdf-00c6-4793-851c-8dd1b7d6d5ed` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-1cd1553c-a677-4f67-b656-375f3aa3a1c0` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-55b1fb20-3a2e-4f5b-8c40-a7236abe7ef0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4f1dc13b-0b4b-4868-9651-c18380dbecdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f1dc13b-0b4b-4868-9651-c18380dbecdc
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6cd76f9165","displayName":"QA 8b6cd76f9165","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f1dc13b-0b4b-4868-9651-c18380dbecdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Location: /v1/accounts/qa-8b6cd76f9165
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86e35d92-ede7-4b87-ab79-9f70b59462bb","handle":"qa-8b6cd76f9165","displayName":"QA 8b6cd76f9165","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.915882672Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2e6279d1-89fb-4170-ac87-0cf4737049e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e6279d1-89fb-4170-ac87-0cf4737049e2
Content-Type: application/json

--- request body ---
{"handle":"qa-198cc120be9f","displayName":"QA 198cc120be9f","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e6279d1-89fb-4170-ac87-0cf4737049e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Location: /v1/accounts/qa-198cc120be9f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3884552-e0a9-4ad2-9b9f-9c53002cbb4b","handle":"qa-198cc120be9f","displayName":"QA 198cc120be9f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.996782803Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0e3dda0d-6dd4-4799-813d-a0aab3b8f6ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e3dda0d-6dd4-4799-813d-a0aab3b8f6ca
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6cd76f9165","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e3dda0d-6dd4-4799-813d-a0aab3b8f6ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86e35d92-ede7-4b87-ab79-9f70b59462bb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a31c88d3-9403-404f-9029-31b18d64575a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31c88d3-9403-404f-9029-31b18d64575a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-198cc120be9f","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a31c88d3-9403-404f-9029-31b18d64575a
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
Location: /v1/conversations/cnv_2b0d8160-d386-4455-b141-09f525f292cf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2b0d8160-d386-4455-b141-09f525f292cf","subject":"Error contract","status":"open","region":"eu","participants":["qa-8b6cd76f9165","qa-198cc120be9f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.072268110Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2b0d8160-d386-4455-b141-09f525f292cf/messages
correlation: qa-b901fc15-8c3b-4987-9b8a-9579be846e5c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e40efaca-eeab-43a9-ba80-6d68fe514e54
X-Correlation-Id: qa-b901fc15-8c3b-4987-9b8a-9579be846e5c
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b901fc15-8c3b-4987-9b8a-9579be846e5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2b0d8160-d386-4455-b141-09f525f292cf/messages","correlationId":"qa-b901fc15-8c3b-4987-9b8a-9579be846e5c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-16f358f0-80fa-4337-bd54-530055bace28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f358f0-80fa-4337-bd54-530055bace28
Content-Type: application/json

--- request body ---
{"handle":"qa-198cc120be9f","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-16f358f0-80fa-4337-bd54-530055bace28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3884552-e0a9-4ad2-9b9f-9c53002cbb4b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7380611b-0fe1-452e-8413-5f23fd9f5bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7380611b-0fe1-452e-8413-5f23fd9f5bbd
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7380611b-0fe1-452e-8413-5f23fd9f5bbd
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
correlation: qa-52050bdf-00c6-4793-851c-8dd1b7d6d5ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52050bdf-00c6-4793-851c-8dd1b7d6d5ed
Content-Type: application/json

--- request body ---
{"handle":"qa-198cc120be9f","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52050bdf-00c6-4793-851c-8dd1b7d6d5ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52050bdf-00c6-4793-851c-8dd1b7d6d5ed"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1cd1553c-a677-4f67-b656-375f3aa3a1c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cd1553c-a677-4f67-b656-375f3aa3a1c0
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1cd1553c-a677-4f67-b656-375f3aa3a1c0
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
correlation: qa-55b1fb20-3a2e-4f5b-8c40-a7236abe7ef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55b1fb20-3a2e-4f5b-8c40-a7236abe7ef0
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6cd76f9165","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55b1fb20-3a2e-4f5b-8c40-a7236abe7ef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55b1fb20-3a2e-4f5b-8c40-a7236abe7ef0"}
```
