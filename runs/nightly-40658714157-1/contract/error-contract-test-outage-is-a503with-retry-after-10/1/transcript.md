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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-54ba3f96-c81d-49ba-98bd-091e0aac3951` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-068de7d9-72be-49ae-93bc-90472e7885ab` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-4738dfc0-27cf-4360-8d0f-2fda3b62a26f` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-b01a204f-ec25-4530-8b33-b09ca906656c` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 15 | `qa-0f5a0d22-f748-4641-b315-d0e7fc7c7fba` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-270616e2-3974-43ed-8ee9-a812cea1f5be` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d16aa255-25fe-4c69-81e0-9aaf6719b017` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-e2121086-b933-49ba-92ec-91e9b5c7ad07` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-62fd9baf-a972-4fbc-8ca3-a5661ebf626d` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-8d25f2f2-43ea-46b7-abfd-b6f800ef1ab9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54ba3f96-c81d-49ba-98bd-091e0aac3951

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54ba3f96-c81d-49ba-98bd-091e0aac3951
Content-Type: application/json

--- request body ---
{"handle":"qa-e57a61638500","displayName":"QA e57a61638500","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-54ba3f96-c81d-49ba-98bd-091e0aac3951
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-e57a61638500
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89441736-a0c4-4451-9418-658118030da6","handle":"qa-e57a61638500","displayName":"QA e57a61638500","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.692707739Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-068de7d9-72be-49ae-93bc-90472e7885ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-068de7d9-72be-49ae-93bc-90472e7885ab
Content-Type: application/json

--- request body ---
{"handle":"qa-5b2cbbb70c5c","displayName":"QA 5b2cbbb70c5c","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-068de7d9-72be-49ae-93bc-90472e7885ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-5b2cbbb70c5c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78258edb-cdf9-4bbf-bb2f-65a69ab384fa","handle":"qa-5b2cbbb70c5c","displayName":"QA 5b2cbbb70c5c","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.748798437Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4738dfc0-27cf-4360-8d0f-2fda3b62a26f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4738dfc0-27cf-4360-8d0f-2fda3b62a26f
Content-Type: application/json

--- request body ---
{"handle":"qa-e57a61638500","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4738dfc0-27cf-4360-8d0f-2fda3b62a26f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89441736-a0c4-4451-9418-658118030da6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b01a204f-ec25-4530-8b33-b09ca906656c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b01a204f-ec25-4530-8b33-b09ca906656c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b2cbbb70c5c","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b01a204f-ec25-4530-8b33-b09ca906656c
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
Location: /v1/conversations/cnv_2d563500-66c4-41a5-8d4e-2559b4876166
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2d563500-66c4-41a5-8d4e-2559b4876166","subject":"Error contract","status":"open","region":"eu","participants":["qa-e57a61638500","qa-5b2cbbb70c5c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.820770848Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2d563500-66c4-41a5-8d4e-2559b4876166/messages
correlation: qa-0f5a0d22-f748-4641-b315-d0e7fc7c7fba

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: aff21776-6713-4972-ba0c-5a78beacc9cb
X-Correlation-Id: qa-0f5a0d22-f748-4641-b315-d0e7fc7c7fba
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f5a0d22-f748-4641-b315-d0e7fc7c7fba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2d563500-66c4-41a5-8d4e-2559b4876166/messages","correlationId":"qa-0f5a0d22-f748-4641-b315-d0e7fc7c7fba"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-270616e2-3974-43ed-8ee9-a812cea1f5be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270616e2-3974-43ed-8ee9-a812cea1f5be
Content-Type: application/json

--- request body ---
{"handle":"qa-5b2cbbb70c5c","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-270616e2-3974-43ed-8ee9-a812cea1f5be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78258edb-cdf9-4bbf-bb2f-65a69ab384fa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d16aa255-25fe-4c69-81e0-9aaf6719b017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d16aa255-25fe-4c69-81e0-9aaf6719b017
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d16aa255-25fe-4c69-81e0-9aaf6719b017
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
correlation: qa-e2121086-b933-49ba-92ec-91e9b5c7ad07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2121086-b933-49ba-92ec-91e9b5c7ad07
Content-Type: application/json

--- request body ---
{"handle":"qa-5b2cbbb70c5c","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2121086-b933-49ba-92ec-91e9b5c7ad07
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2121086-b933-49ba-92ec-91e9b5c7ad07"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62fd9baf-a972-4fbc-8ca3-a5661ebf626d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62fd9baf-a972-4fbc-8ca3-a5661ebf626d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62fd9baf-a972-4fbc-8ca3-a5661ebf626d
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
correlation: qa-8d25f2f2-43ea-46b7-abfd-b6f800ef1ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d25f2f2-43ea-46b7-abfd-b6f800ef1ab9
Content-Type: application/json

--- request body ---
{"handle":"qa-e57a61638500","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d25f2f2-43ea-46b7-abfd-b6f800ef1ab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d25f2f2-43ea-46b7-abfd-b6f800ef1ab9"}
```
