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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-b7d4786c-0376-42f3-82f0-a6a4a090b034` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-54138cc6-2a01-41be-bd8e-fca9a7d0d66e` |
| 3 | `POST /v1/auth/token` | 200 | 66 | `qa-9ddc29bc-fb49-40d5-9cbf-41a1c151e076` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-12de2c6e-c1ea-4308-b9d5-657170266f46` |
| 5 | `GET /v1/credits/ledger` | 503 | 11 | `qa-9ab8e2c4-13cc-4015-ab2c-250a0875b87f` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-08a3e39b-faf0-4c4a-b1ad-adcacb448107` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-63a1a16f-76ed-40ac-9c79-2e321bf60bef` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-81b38977-95b9-4021-8b46-0ae80c081886` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-55311bc6-c407-4af6-8292-0f09f33e14c0` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-f7add008-7ec0-455e-b1ab-da0aee0879d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7d4786c-0376-42f3-82f0-a6a4a090b034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7d4786c-0376-42f3-82f0-a6a4a090b034
Content-Type: application/json

--- request body ---
{"handle":"qa-e5f7de61a96c","displayName":"QA e5f7de61a96c","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7d4786c-0376-42f3-82f0-a6a4a090b034
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-e5f7de61a96c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a66b9994-e4a5-43ed-88f8-c8036401610a","handle":"qa-e5f7de61a96c","displayName":"QA e5f7de61a96c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.254271709Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-54138cc6-2a01-41be-bd8e-fca9a7d0d66e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54138cc6-2a01-41be-bd8e-fca9a7d0d66e
Content-Type: application/json

--- request body ---
{"handle":"qa-dc8e470d9db3","displayName":"QA dc8e470d9db3","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-54138cc6-2a01-41be-bd8e-fca9a7d0d66e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Location: /v1/accounts/qa-dc8e470d9db3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a78998b7-b25a-4cdf-8e7e-6dd37ebd1e4b","handle":"qa-dc8e470d9db3","displayName":"QA dc8e470d9db3","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.277146416Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9ddc29bc-fb49-40d5-9cbf-41a1c151e076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ddc29bc-fb49-40d5-9cbf-41a1c151e076
Content-Type: application/json

--- request body ---
{"handle":"qa-e5f7de61a96c","password":"****"}

--- response: 200 in 66 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ddc29bc-fb49-40d5-9cbf-41a1c151e076
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a66b9994-e4a5-43ed-88f8-c8036401610a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-12de2c6e-c1ea-4308-b9d5-657170266f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12de2c6e-c1ea-4308-b9d5-657170266f46
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dc8e470d9db3","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-12de2c6e-c1ea-4308-b9d5-657170266f46
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
Location: /v1/conversations/cnv_9eaed0d8-6a8f-4a92-97e7-eafc2fe64cdb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9eaed0d8-6a8f-4a92-97e7-eafc2fe64cdb","subject":"Error contract","status":"open","region":"eu","participants":["qa-e5f7de61a96c","qa-dc8e470d9db3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.370268168Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9ab8e2c4-13cc-4015-ab2c-250a0875b87f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 42ca80d6-0b32-4e8c-883f-afd3e6a8a39d
X-Correlation-Id: qa-9ab8e2c4-13cc-4015-ab2c-250a0875b87f
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ab8e2c4-13cc-4015-ab2c-250a0875b87f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-9ab8e2c4-13cc-4015-ab2c-250a0875b87f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-08a3e39b-faf0-4c4a-b1ad-adcacb448107

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a3e39b-faf0-4c4a-b1ad-adcacb448107
Content-Type: application/json

--- request body ---
{"handle":"qa-dc8e470d9db3","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-08a3e39b-faf0-4c4a-b1ad-adcacb448107
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a78998b7-b25a-4cdf-8e7e-6dd37ebd1e4b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63a1a16f-76ed-40ac-9c79-2e321bf60bef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63a1a16f-76ed-40ac-9c79-2e321bf60bef
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63a1a16f-76ed-40ac-9c79-2e321bf60bef
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
correlation: qa-81b38977-95b9-4021-8b46-0ae80c081886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b38977-95b9-4021-8b46-0ae80c081886
Content-Type: application/json

--- request body ---
{"handle":"qa-dc8e470d9db3","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81b38977-95b9-4021-8b46-0ae80c081886
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81b38977-95b9-4021-8b46-0ae80c081886"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55311bc6-c407-4af6-8292-0f09f33e14c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55311bc6-c407-4af6-8292-0f09f33e14c0
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55311bc6-c407-4af6-8292-0f09f33e14c0
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
correlation: qa-f7add008-7ec0-455e-b1ab-da0aee0879d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7add008-7ec0-455e-b1ab-da0aee0879d9
Content-Type: application/json

--- request body ---
{"handle":"qa-e5f7de61a96c","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7add008-7ec0-455e-b1ab-da0aee0879d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7add008-7ec0-455e-b1ab-da0aee0879d9"}
```
