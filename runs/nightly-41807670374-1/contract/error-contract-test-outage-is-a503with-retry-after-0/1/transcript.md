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
| 1 | `POST /v1/accounts` | 201 | 444 | `qa-2b4d1891-ca07-4d56-8e52-f2935b98f9a7` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-d60a05bf-b805-48e2-a819-29df003445d7` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-83cf190f-708b-4618-a7eb-9a44b302dfb1` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-1fe0f8f5-ffd1-4207-b9b5-297e53f7417f` |
| 5 | `POST /v1/auth/token` | 503 | 37 | `qa-52a6d38c-9945-4731-b5fd-077aba85a430` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-7ebb9f9a-9eec-48e3-8096-554a16959665` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-a87b7448-0d20-4de6-9059-9a1537df931a` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-ee994f69-e3cb-4a12-b91c-7628a1e1f318` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-506bb2f1-2f41-4204-bd4a-3c0a782f547a` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-5fe711ec-8e2f-4263-b22f-03e80a4fa1b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2b4d1891-ca07-4d56-8e52-f2935b98f9a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b4d1891-ca07-4d56-8e52-f2935b98f9a7
Content-Type: application/json

--- request body ---
{"handle":"qa-2a4cdf0aded7","displayName":"QA 2a4cdf0aded7","password":"****","region":"eu"}

--- response: 201 in 444 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b4d1891-ca07-4d56-8e52-f2935b98f9a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-2a4cdf0aded7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45bd21aa-2386-40f5-9c02-2eb204272fb3","handle":"qa-2a4cdf0aded7","displayName":"QA 2a4cdf0aded7","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.104234087Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d60a05bf-b805-48e2-a819-29df003445d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d60a05bf-b805-48e2-a819-29df003445d7
Content-Type: application/json

--- request body ---
{"handle":"qa-b91c91d19003","displayName":"QA b91c91d19003","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d60a05bf-b805-48e2-a819-29df003445d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-b91c91d19003
X-Served-Region: eu
Content-Length: 181

{"id":"acc_662620de-c517-4f5d-9cdc-0c70dfbf2079","handle":"qa-b91c91d19003","displayName":"QA b91c91d19003","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.393209334Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-83cf190f-708b-4618-a7eb-9a44b302dfb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83cf190f-708b-4618-a7eb-9a44b302dfb1
Content-Type: application/json

--- request body ---
{"handle":"qa-2a4cdf0aded7","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-83cf190f-708b-4618-a7eb-9a44b302dfb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45bd21aa-2386-40f5-9c02-2eb204272fb3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1fe0f8f5-ffd1-4207-b9b5-297e53f7417f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fe0f8f5-ffd1-4207-b9b5-297e53f7417f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b91c91d19003","subject":"Error contract","message":"Hi"}

--- response: 201 in 51 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fe0f8f5-ffd1-4207-b9b5-297e53f7417f
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
Location: /v1/conversations/cnv_46274e28-34ee-45b5-858f-a57ecacfd960
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_46274e28-34ee-45b5-858f-a57ecacfd960","subject":"Error contract","status":"open","region":"eu","participants":["qa-2a4cdf0aded7","qa-b91c91d19003"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.529740610Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-52a6d38c-9945-4731-b5fd-077aba85a430

--- request headers ---
Accept: application/json
X-Fault-Key: b28b0b00-f4ab-4a91-8985-fbddfab924a7
X-Fault: unavailable-once
X-Correlation-Id: qa-52a6d38c-9945-4731-b5fd-077aba85a430
Content-Type: application/json

--- request body ---
{"handle":"qa-2a4cdf0aded7","password":"****"}

--- response: 503 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52a6d38c-9945-4731-b5fd-077aba85a430
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-52a6d38c-9945-4731-b5fd-077aba85a430"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7ebb9f9a-9eec-48e3-8096-554a16959665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ebb9f9a-9eec-48e3-8096-554a16959665
Content-Type: application/json

--- request body ---
{"handle":"qa-b91c91d19003","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ebb9f9a-9eec-48e3-8096-554a16959665
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_662620de-c517-4f5d-9cdc-0c70dfbf2079"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a87b7448-0d20-4de6-9059-9a1537df931a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a87b7448-0d20-4de6-9059-9a1537df931a
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a87b7448-0d20-4de6-9059-9a1537df931a
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
correlation: qa-ee994f69-e3cb-4a12-b91c-7628a1e1f318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee994f69-e3cb-4a12-b91c-7628a1e1f318
Content-Type: application/json

--- request body ---
{"handle":"qa-b91c91d19003","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee994f69-e3cb-4a12-b91c-7628a1e1f318
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee994f69-e3cb-4a12-b91c-7628a1e1f318"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-506bb2f1-2f41-4204-bd4a-3c0a782f547a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506bb2f1-2f41-4204-bd4a-3c0a782f547a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-506bb2f1-2f41-4204-bd4a-3c0a782f547a
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
correlation: qa-5fe711ec-8e2f-4263-b22f-03e80a4fa1b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fe711ec-8e2f-4263-b22f-03e80a4fa1b2
Content-Type: application/json

--- request body ---
{"handle":"qa-2a4cdf0aded7","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fe711ec-8e2f-4263-b22f-03e80a4fa1b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5fe711ec-8e2f-4263-b22f-03e80a4fa1b2"}
```
