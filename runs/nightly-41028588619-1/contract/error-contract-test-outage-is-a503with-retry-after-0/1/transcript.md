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
| 1 | `POST /v1/accounts` | 201 | 481 | `qa-d05558e8-e917-4e26-b8a6-0ad624fd0251` |
| 2 | `POST /v1/accounts` | 201 | 106 | `qa-e42a0181-3f0b-42cb-8193-53c2c765933d` |
| 3 | `POST /v1/auth/token` | 200 | 95 | `qa-1aa19b9c-ae22-4736-973a-aab988994eca` |
| 4 | `POST /v1/conversations` | 201 | 77 | `qa-340c224e-3bc3-4211-8211-54237262b120` |
| 5 | `POST /v1/auth/token` | 503 | 26 | `qa-9afac5ab-eab2-431d-810a-db4dbdc9cb21` |
| 6 | `POST /v1/auth/token` | 200 | 59 | `qa-6b3872fc-1019-4463-94cc-aa6caa0e8467` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-98e425fe-f45d-42d6-af2e-7c9bd826163f` |
| 8 | `POST /v1/auth/token` | 401 | 46 | `qa-802aba14-c18e-4854-b96c-17a89cfca2ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-dbeb4a06-a7d4-4ae1-af0a-0acba17deb0b` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-1a49fe01-07a9-47fd-bbb4-dd33eab31c8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d05558e8-e917-4e26-b8a6-0ad624fd0251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d05558e8-e917-4e26-b8a6-0ad624fd0251
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec719fd4417","displayName":"QA 5ec719fd4417","password":"****","region":"eu"}

--- response: 201 in 481 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d05558e8-e917-4e26-b8a6-0ad624fd0251
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-5ec719fd4417
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba9fbef3-e639-4afd-9414-535049a408b9","handle":"qa-5ec719fd4417","displayName":"QA 5ec719fd4417","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.380841573Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e42a0181-3f0b-42cb-8193-53c2c765933d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42a0181-3f0b-42cb-8193-53c2c765933d
Content-Type: application/json

--- request body ---
{"handle":"qa-bf916d6258d8","displayName":"QA bf916d6258d8","password":"****","region":"eu"}

--- response: 201 in 106 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e42a0181-3f0b-42cb-8193-53c2c765933d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-bf916d6258d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa2b933d-12fb-4a34-958e-5545b74750a4","handle":"qa-bf916d6258d8","displayName":"QA bf916d6258d8","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.912726042Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1aa19b9c-ae22-4736-973a-aab988994eca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa19b9c-ae22-4736-973a-aab988994eca
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec719fd4417","password":"****"}

--- response: 200 in 95 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1aa19b9c-ae22-4736-973a-aab988994eca
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba9fbef3-e639-4afd-9414-535049a408b9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-340c224e-3bc3-4211-8211-54237262b120

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-340c224e-3bc3-4211-8211-54237262b120
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bf916d6258d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 77 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-340c224e-3bc3-4211-8211-54237262b120
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
Location: /v1/conversations/cnv_ba3026c5-7f8d-4fa7-9e79-8b4a42e8d53b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ba3026c5-7f8d-4fa7-9e79-8b4a42e8d53b","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ec719fd4417","qa-bf916d6258d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.199997141Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9afac5ab-eab2-431d-810a-db4dbdc9cb21

--- request headers ---
Accept: application/json
X-Fault-Key: 559c4656-52d5-4a37-a369-f909855c19c3
X-Fault: unavailable-once
X-Correlation-Id: qa-9afac5ab-eab2-431d-810a-db4dbdc9cb21
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec719fd4417","password":"****"}

--- response: 503 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9afac5ab-eab2-431d-810a-db4dbdc9cb21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-9afac5ab-eab2-431d-810a-db4dbdc9cb21"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6b3872fc-1019-4463-94cc-aa6caa0e8467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b3872fc-1019-4463-94cc-aa6caa0e8467
Content-Type: application/json

--- request body ---
{"handle":"qa-bf916d6258d8","password":"****"}

--- response: 200 in 59 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b3872fc-1019-4463-94cc-aa6caa0e8467
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa2b933d-12fb-4a34-958e-5545b74750a4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98e425fe-f45d-42d6-af2e-7c9bd826163f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e425fe-f45d-42d6-af2e-7c9bd826163f
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98e425fe-f45d-42d6-af2e-7c9bd826163f
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
correlation: qa-802aba14-c18e-4854-b96c-17a89cfca2ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-802aba14-c18e-4854-b96c-17a89cfca2ee
Content-Type: application/json

--- request body ---
{"handle":"qa-bf916d6258d8","password":"****"}

--- response: 401 in 46 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-802aba14-c18e-4854-b96c-17a89cfca2ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-802aba14-c18e-4854-b96c-17a89cfca2ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbeb4a06-a7d4-4ae1-af0a-0acba17deb0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbeb4a06-a7d4-4ae1-af0a-0acba17deb0b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbeb4a06-a7d4-4ae1-af0a-0acba17deb0b
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
correlation: qa-1a49fe01-07a9-47fd-bbb4-dd33eab31c8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a49fe01-07a9-47fd-bbb4-dd33eab31c8c
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec719fd4417","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a49fe01-07a9-47fd-bbb4-dd33eab31c8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a49fe01-07a9-47fd-bbb4-dd33eab31c8c"}
```
