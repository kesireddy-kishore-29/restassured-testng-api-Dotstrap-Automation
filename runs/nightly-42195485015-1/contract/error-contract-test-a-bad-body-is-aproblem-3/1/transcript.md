# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-8f058020-f46e-4247-b2fe-0c89a6f92242` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-dc622134-4288-4074-9eaa-60a216aaa148` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-4e0e3d92-ad76-47ea-a69d-a5518446710e` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-b3841eff-1775-4fe9-8489-5ce0b5d6e4a9` |
| 5 | `POST /v1/accounts` | 400 | 16 | `qa-dcdf0756-7431-447d-bfbe-7011dbef7008` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-3996275c-53ef-4cc2-b987-e4bc8ef4f035` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-9d5d8b43-b076-4dd3-ac5a-312a06f46c1b` |
| 8 | `POST /v1/auth/token` | 401 | 45 | `qa-0e79fbd3-e700-41b0-804d-f9793d1db49d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-4b8d6d00-92d8-4900-a12e-65030af3b0bd` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-e714ce0a-874b-471e-99dc-f436eeefce55` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f058020-f46e-4247-b2fe-0c89a6f92242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f058020-f46e-4247-b2fe-0c89a6f92242
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7595a301c9","displayName":"QA cf7595a301c9","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f058020-f46e-4247-b2fe-0c89a6f92242
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-cf7595a301c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4337ab1-dbac-458c-a228-b0a4224218ec","handle":"qa-cf7595a301c9","displayName":"QA cf7595a301c9","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.215570407Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dc622134-4288-4074-9eaa-60a216aaa148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc622134-4288-4074-9eaa-60a216aaa148
Content-Type: application/json

--- request body ---
{"handle":"qa-022af065a6f4","displayName":"QA 022af065a6f4","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc622134-4288-4074-9eaa-60a216aaa148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Location: /v1/accounts/qa-022af065a6f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b6b6338-b190-48ee-9eb8-e5bdd14810c2","handle":"qa-022af065a6f4","displayName":"QA 022af065a6f4","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.261597495Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4e0e3d92-ad76-47ea-a69d-a5518446710e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e0e3d92-ad76-47ea-a69d-a5518446710e
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7595a301c9","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e0e3d92-ad76-47ea-a69d-a5518446710e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4337ab1-dbac-458c-a228-b0a4224218ec"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b3841eff-1775-4fe9-8489-5ce0b5d6e4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3841eff-1775-4fe9-8489-5ce0b5d6e4a9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-022af065a6f4","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3841eff-1775-4fe9-8489-5ce0b5d6e4a9
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
Location: /v1/conversations/cnv_6d68e737-f816-4fb5-89cb-f78198904fa4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6d68e737-f816-4fb5-89cb-f78198904fa4","subject":"Error contract","status":"open","region":"eu","participants":["qa-cf7595a301c9","qa-022af065a6f4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.313297610Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-dcdf0756-7431-447d-bfbe-7011dbef7008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcdf0756-7431-447d-bfbe-7011dbef7008
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcdf0756-7431-447d-bfbe-7011dbef7008
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-dcdf0756-7431-447d-bfbe-7011dbef7008"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3996275c-53ef-4cc2-b987-e4bc8ef4f035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3996275c-53ef-4cc2-b987-e4bc8ef4f035
Content-Type: application/json

--- request body ---
{"handle":"qa-022af065a6f4","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3996275c-53ef-4cc2-b987-e4bc8ef4f035
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b6b6338-b190-48ee-9eb8-e5bdd14810c2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d5d8b43-b076-4dd3-ac5a-312a06f46c1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d5d8b43-b076-4dd3-ac5a-312a06f46c1b
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d5d8b43-b076-4dd3-ac5a-312a06f46c1b
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
correlation: qa-0e79fbd3-e700-41b0-804d-f9793d1db49d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e79fbd3-e700-41b0-804d-f9793d1db49d
Content-Type: application/json

--- request body ---
{"handle":"qa-022af065a6f4","password":"****"}

--- response: 401 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e79fbd3-e700-41b0-804d-f9793d1db49d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e79fbd3-e700-41b0-804d-f9793d1db49d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b8d6d00-92d8-4900-a12e-65030af3b0bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b8d6d00-92d8-4900-a12e-65030af3b0bd
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b8d6d00-92d8-4900-a12e-65030af3b0bd
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
correlation: qa-e714ce0a-874b-471e-99dc-f436eeefce55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e714ce0a-874b-471e-99dc-f436eeefce55
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7595a301c9","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e714ce0a-874b-471e-99dc-f436eeefce55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e714ce0a-874b-471e-99dc-f436eeefce55"}
```
