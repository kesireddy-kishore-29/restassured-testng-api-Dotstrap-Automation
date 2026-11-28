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
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-10ada506-e642-432f-a82d-4398784aeb2d` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-a3abcb84-cd92-4406-b5c2-b707db3aee05` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-dc7c5230-5412-4c7c-990a-0c21c074a3ba` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-443a7a21-49a7-45ae-860c-7e18b22c6057` |
| 5 | `GET /v1/credits/ledger` | 503 | 21 | `qa-35a754d0-2c63-473a-9239-fc654506f317` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-b56e81c7-04e7-4cbf-9b5b-8c25165ecb46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-90ab9f63-9317-428b-a69b-676857f5144a` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-1fdf160e-c39a-4c6e-97e6-3e628df5dc16` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-67f3a260-ccc0-494c-a3b1-3c7fa726b574` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-9b62a51b-80b6-455f-983d-fd1f73a07069` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-10ada506-e642-432f-a82d-4398784aeb2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ada506-e642-432f-a82d-4398784aeb2d
Content-Type: application/json

--- request body ---
{"handle":"qa-26906ca8a754","displayName":"QA 26906ca8a754","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ada506-e642-432f-a82d-4398784aeb2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Location: /v1/accounts/qa-26906ca8a754
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d13e5393-c4e6-4845-ad0d-51aa04f0cb8c","handle":"qa-26906ca8a754","displayName":"QA 26906ca8a754","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.739786314Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a3abcb84-cd92-4406-b5c2-b707db3aee05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3abcb84-cd92-4406-b5c2-b707db3aee05
Content-Type: application/json

--- request body ---
{"handle":"qa-13ccb83779c3","displayName":"QA 13ccb83779c3","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3abcb84-cd92-4406-b5c2-b707db3aee05
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
Location: /v1/accounts/qa-13ccb83779c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2922500c-6d77-4732-9509-6f11543fd4bd","handle":"qa-13ccb83779c3","displayName":"QA 13ccb83779c3","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.787211334Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc7c5230-5412-4c7c-990a-0c21c074a3ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc7c5230-5412-4c7c-990a-0c21c074a3ba
Content-Type: application/json

--- request body ---
{"handle":"qa-26906ca8a754","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc7c5230-5412-4c7c-990a-0c21c074a3ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d13e5393-c4e6-4845-ad0d-51aa04f0cb8c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-443a7a21-49a7-45ae-860c-7e18b22c6057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443a7a21-49a7-45ae-860c-7e18b22c6057
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-13ccb83779c3","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-443a7a21-49a7-45ae-860c-7e18b22c6057
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
Location: /v1/conversations/cnv_2f844dcb-e118-4d7e-930c-89444d97052b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2f844dcb-e118-4d7e-930c-89444d97052b","subject":"Error contract","status":"open","region":"eu","participants":["qa-26906ca8a754","qa-13ccb83779c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.929968770Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-35a754d0-2c63-473a-9239-fc654506f317

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 083b5a94-e17d-44b4-87d1-5e81eef03796
X-Correlation-Id: qa-35a754d0-2c63-473a-9239-fc654506f317
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35a754d0-2c63-473a-9239-fc654506f317
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-35a754d0-2c63-473a-9239-fc654506f317"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b56e81c7-04e7-4cbf-9b5b-8c25165ecb46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b56e81c7-04e7-4cbf-9b5b-8c25165ecb46
Content-Type: application/json

--- request body ---
{"handle":"qa-13ccb83779c3","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b56e81c7-04e7-4cbf-9b5b-8c25165ecb46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2922500c-6d77-4732-9509-6f11543fd4bd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90ab9f63-9317-428b-a69b-676857f5144a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90ab9f63-9317-428b-a69b-676857f5144a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90ab9f63-9317-428b-a69b-676857f5144a
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
correlation: qa-1fdf160e-c39a-4c6e-97e6-3e628df5dc16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fdf160e-c39a-4c6e-97e6-3e628df5dc16
Content-Type: application/json

--- request body ---
{"handle":"qa-13ccb83779c3","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1fdf160e-c39a-4c6e-97e6-3e628df5dc16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1fdf160e-c39a-4c6e-97e6-3e628df5dc16"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67f3a260-ccc0-494c-a3b1-3c7fa726b574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67f3a260-ccc0-494c-a3b1-3c7fa726b574
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67f3a260-ccc0-494c-a3b1-3c7fa726b574
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
correlation: qa-9b62a51b-80b6-455f-983d-fd1f73a07069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b62a51b-80b6-455f-983d-fd1f73a07069
Content-Type: application/json

--- request body ---
{"handle":"qa-26906ca8a754","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b62a51b-80b6-455f-983d-fd1f73a07069
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b62a51b-80b6-455f-983d-fd1f73a07069"}
```
