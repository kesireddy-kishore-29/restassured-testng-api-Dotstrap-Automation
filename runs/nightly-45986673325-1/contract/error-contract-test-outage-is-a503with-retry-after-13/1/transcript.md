# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-ea0aedd2-4c6c-4642-ba7f-8ff337a935f6` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-519d854a-fde1-45e8-a717-97af6ead42e2` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-cadcb949-697e-464a-a1d8-afd2fbc77996` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-501b68a0-5b1d-477f-8c18-73b342377bd4` |
| 5 | `GET /v1/credits/balance` | 503 | 12 | `qa-93ebd7b5-aaa1-41a6-af13-3120093919f2` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-b665a3af-5e16-45ad-b1f1-2a27be6dd329` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-022ce92c-6683-48b5-8d0a-09832e3c49da` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-37ccfcf1-34e2-4602-b3ef-971b50a99661` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-664acd4c-0271-4f1c-90d0-953d744fcd1d` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-7491dcdd-9939-4243-9114-18f15663d6c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea0aedd2-4c6c-4642-ba7f-8ff337a935f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea0aedd2-4c6c-4642-ba7f-8ff337a935f6
Content-Type: application/json

--- request body ---
{"handle":"qa-1b37cde81b28","displayName":"QA 1b37cde81b28","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea0aedd2-4c6c-4642-ba7f-8ff337a935f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-1b37cde81b28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_809c761b-7511-495e-91f0-30ce135ab1a4","handle":"qa-1b37cde81b28","displayName":"QA 1b37cde81b28","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.726305181Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-519d854a-fde1-45e8-a717-97af6ead42e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-519d854a-fde1-45e8-a717-97af6ead42e2
Content-Type: application/json

--- request body ---
{"handle":"qa-86fbc1b55994","displayName":"QA 86fbc1b55994","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-519d854a-fde1-45e8-a717-97af6ead42e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-86fbc1b55994
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2661089f-99d0-4e06-9a38-aff47a4e091c","handle":"qa-86fbc1b55994","displayName":"QA 86fbc1b55994","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.781718485Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cadcb949-697e-464a-a1d8-afd2fbc77996

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cadcb949-697e-464a-a1d8-afd2fbc77996
Content-Type: application/json

--- request body ---
{"handle":"qa-1b37cde81b28","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cadcb949-697e-464a-a1d8-afd2fbc77996
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_809c761b-7511-495e-91f0-30ce135ab1a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-501b68a0-5b1d-477f-8c18-73b342377bd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-501b68a0-5b1d-477f-8c18-73b342377bd4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-86fbc1b55994","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-501b68a0-5b1d-477f-8c18-73b342377bd4
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
Location: /v1/conversations/cnv_4eb7f6ae-762f-4c78-83b4-688c9a34db33
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4eb7f6ae-762f-4c78-83b4-688c9a34db33","subject":"Error contract","status":"open","region":"eu","participants":["qa-1b37cde81b28","qa-86fbc1b55994"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.878805892Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-93ebd7b5-aaa1-41a6-af13-3120093919f2

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a2a8ea71-1ffa-45c1-9ba2-f807ab2d8d50
X-Correlation-Id: qa-93ebd7b5-aaa1-41a6-af13-3120093919f2
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93ebd7b5-aaa1-41a6-af13-3120093919f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-93ebd7b5-aaa1-41a6-af13-3120093919f2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b665a3af-5e16-45ad-b1f1-2a27be6dd329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b665a3af-5e16-45ad-b1f1-2a27be6dd329
Content-Type: application/json

--- request body ---
{"handle":"qa-86fbc1b55994","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b665a3af-5e16-45ad-b1f1-2a27be6dd329
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2661089f-99d0-4e06-9a38-aff47a4e091c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-022ce92c-6683-48b5-8d0a-09832e3c49da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-022ce92c-6683-48b5-8d0a-09832e3c49da
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-022ce92c-6683-48b5-8d0a-09832e3c49da
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
correlation: qa-37ccfcf1-34e2-4602-b3ef-971b50a99661

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ccfcf1-34e2-4602-b3ef-971b50a99661
Content-Type: application/json

--- request body ---
{"handle":"qa-86fbc1b55994","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37ccfcf1-34e2-4602-b3ef-971b50a99661
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37ccfcf1-34e2-4602-b3ef-971b50a99661"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-664acd4c-0271-4f1c-90d0-953d744fcd1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-664acd4c-0271-4f1c-90d0-953d744fcd1d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-664acd4c-0271-4f1c-90d0-953d744fcd1d
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
correlation: qa-7491dcdd-9939-4243-9114-18f15663d6c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7491dcdd-9939-4243-9114-18f15663d6c0
Content-Type: application/json

--- request body ---
{"handle":"qa-1b37cde81b28","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7491dcdd-9939-4243-9114-18f15663d6c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7491dcdd-9939-4243-9114-18f15663d6c0"}
```
