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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-06b24cd7-c299-44ba-9da5-4a8bf02e4d07` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-a59abde1-2d6c-4c54-bee0-b832602de55d` |
| 3 | `POST /v1/auth/token` | 200 | 6 | `qa-e68ae012-4133-42c3-9293-e451ff61e442` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-4b5e443d-3969-40f7-85c5-18f9e8bbc4cc` |
| 5 | `POST /v1/auth/token` | 503 | 8 | `qa-965510f4-4ef0-4f60-abce-8f3d5054f4d2` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-add904ca-45f0-4bff-ba82-14751536f932` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-01edee59-bcf3-4095-a104-4b0627ea53bd` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-1ec28313-bc6e-43fa-8527-ac05df073ac7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-14a1a308-32a3-459b-bfee-d55d5d0dc049` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-0e460222-6af1-4f37-962c-9773eea7403c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-06b24cd7-c299-44ba-9da5-4a8bf02e4d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b24cd7-c299-44ba-9da5-4a8bf02e4d07
Content-Type: application/json

--- request body ---
{"handle":"qa-4fc29e3947d1","displayName":"QA 4fc29e3947d1","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-06b24cd7-c299-44ba-9da5-4a8bf02e4d07
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
Location: /v1/accounts/qa-4fc29e3947d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db4252c5-7f5d-4faf-8690-f483ad12a2fe","handle":"qa-4fc29e3947d1","displayName":"QA 4fc29e3947d1","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.073149767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a59abde1-2d6c-4c54-bee0-b832602de55d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a59abde1-2d6c-4c54-bee0-b832602de55d
Content-Type: application/json

--- request body ---
{"handle":"qa-2be07849c3bc","displayName":"QA 2be07849c3bc","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-a59abde1-2d6c-4c54-bee0-b832602de55d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-2be07849c3bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af8d54cb-21a8-4d0c-8916-df904846635a","handle":"qa-2be07849c3bc","displayName":"QA 2be07849c3bc","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.129525674Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e68ae012-4133-42c3-9293-e451ff61e442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e68ae012-4133-42c3-9293-e451ff61e442
Content-Type: application/json

--- request body ---
{"handle":"qa-4fc29e3947d1","password":"****"}

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e68ae012-4133-42c3-9293-e451ff61e442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db4252c5-7f5d-4faf-8690-f483ad12a2fe"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4b5e443d-3969-40f7-85c5-18f9e8bbc4cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b5e443d-3969-40f7-85c5-18f9e8bbc4cc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2be07849c3bc","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b5e443d-3969-40f7-85c5-18f9e8bbc4cc
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
Location: /v1/conversations/cnv_1ebbb83e-35a2-461d-bf26-cdfe800381e2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1ebbb83e-35a2-461d-bf26-cdfe800381e2","subject":"Error contract","status":"open","region":"eu","participants":["qa-4fc29e3947d1","qa-2be07849c3bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.161213658Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-965510f4-4ef0-4f60-abce-8f3d5054f4d2

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 45af0ce9-237c-46ea-9375-6d0240be2909
X-Correlation-Id: qa-965510f4-4ef0-4f60-abce-8f3d5054f4d2
Content-Type: application/json

--- request body ---
{"handle":"qa-4fc29e3947d1","password":"****"}

--- response: 503 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-965510f4-4ef0-4f60-abce-8f3d5054f4d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-965510f4-4ef0-4f60-abce-8f3d5054f4d2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-add904ca-45f0-4bff-ba82-14751536f932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-add904ca-45f0-4bff-ba82-14751536f932
Content-Type: application/json

--- request body ---
{"handle":"qa-2be07849c3bc","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-add904ca-45f0-4bff-ba82-14751536f932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af8d54cb-21a8-4d0c-8916-df904846635a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01edee59-bcf3-4095-a104-4b0627ea53bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01edee59-bcf3-4095-a104-4b0627ea53bd
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01edee59-bcf3-4095-a104-4b0627ea53bd
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
correlation: qa-1ec28313-bc6e-43fa-8527-ac05df073ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ec28313-bc6e-43fa-8527-ac05df073ac7
Content-Type: application/json

--- request body ---
{"handle":"qa-2be07849c3bc","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ec28313-bc6e-43fa-8527-ac05df073ac7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ec28313-bc6e-43fa-8527-ac05df073ac7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14a1a308-32a3-459b-bfee-d55d5d0dc049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14a1a308-32a3-459b-bfee-d55d5d0dc049
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14a1a308-32a3-459b-bfee-d55d5d0dc049
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
correlation: qa-0e460222-6af1-4f37-962c-9773eea7403c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e460222-6af1-4f37-962c-9773eea7403c
Content-Type: application/json

--- request body ---
{"handle":"qa-4fc29e3947d1","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e460222-6af1-4f37-962c-9773eea7403c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e460222-6af1-4f37-962c-9773eea7403c"}
```
