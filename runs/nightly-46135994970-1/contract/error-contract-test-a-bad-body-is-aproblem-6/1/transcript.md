# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-9f6c98e1-4073-417d-b6f8-4be912554473` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-fd11fb52-ab0b-4962-b28a-b97c28834ca9` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-bad08282-5582-482f-b817-7d84a1e06032` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-5645c988-1f15-492d-b6e6-e4d0a07ac7cf` |
| 5 | `PATCH /v1/accounts/me` | 400 | 31 | `qa-897442f3-b829-4904-a045-d5161c884b99` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-5259a076-69f5-4300-a21e-4f6a6329994b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-bd75989b-d39d-41fd-92dd-68a03f36e0ea` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-d1a7e87c-98db-44fe-88e1-2c351044377f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-78dc0273-b83f-4e04-b197-38fe78afd01b` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-6556a33f-220d-477e-b2de-0e83c89d811f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9f6c98e1-4073-417d-b6f8-4be912554473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f6c98e1-4073-417d-b6f8-4be912554473
Content-Type: application/json

--- request body ---
{"handle":"qa-ce8f3fce2dc7","displayName":"QA ce8f3fce2dc7","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f6c98e1-4073-417d-b6f8-4be912554473
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-ce8f3fce2dc7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aec1a38e-7353-4991-a571-281b2d237917","handle":"qa-ce8f3fce2dc7","displayName":"QA ce8f3fce2dc7","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.328530096Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fd11fb52-ab0b-4962-b28a-b97c28834ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd11fb52-ab0b-4962-b28a-b97c28834ca9
Content-Type: application/json

--- request body ---
{"handle":"qa-617520333588","displayName":"QA 617520333588","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd11fb52-ab0b-4962-b28a-b97c28834ca9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Location: /v1/accounts/qa-617520333588
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e407fc2b-052c-4f33-b12a-947df815c13b","handle":"qa-617520333588","displayName":"QA 617520333588","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.385344814Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bad08282-5582-482f-b817-7d84a1e06032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bad08282-5582-482f-b817-7d84a1e06032
Content-Type: application/json

--- request body ---
{"handle":"qa-ce8f3fce2dc7","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-bad08282-5582-482f-b817-7d84a1e06032
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aec1a38e-7353-4991-a571-281b2d237917"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5645c988-1f15-492d-b6e6-e4d0a07ac7cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5645c988-1f15-492d-b6e6-e4d0a07ac7cf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-617520333588","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5645c988-1f15-492d-b6e6-e4d0a07ac7cf
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
Location: /v1/conversations/cnv_09d42598-8ac9-4403-a582-97c04206a82d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_09d42598-8ac9-4403-a582-97c04206a82d","subject":"Error contract","status":"open","region":"eu","participants":["qa-ce8f3fce2dc7","qa-617520333588"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.477308400Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-897442f3-b829-4904-a045-d5161c884b99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-897442f3-b829-4904-a045-d5161c884b99
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-897442f3-b829-4904-a045-d5161c884b99
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-897442f3-b829-4904-a045-d5161c884b99"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5259a076-69f5-4300-a21e-4f6a6329994b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5259a076-69f5-4300-a21e-4f6a6329994b
Content-Type: application/json

--- request body ---
{"handle":"qa-617520333588","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5259a076-69f5-4300-a21e-4f6a6329994b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e407fc2b-052c-4f33-b12a-947df815c13b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd75989b-d39d-41fd-92dd-68a03f36e0ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd75989b-d39d-41fd-92dd-68a03f36e0ea
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd75989b-d39d-41fd-92dd-68a03f36e0ea
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
correlation: qa-d1a7e87c-98db-44fe-88e1-2c351044377f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1a7e87c-98db-44fe-88e1-2c351044377f
Content-Type: application/json

--- request body ---
{"handle":"qa-617520333588","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1a7e87c-98db-44fe-88e1-2c351044377f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1a7e87c-98db-44fe-88e1-2c351044377f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78dc0273-b83f-4e04-b197-38fe78afd01b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78dc0273-b83f-4e04-b197-38fe78afd01b
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78dc0273-b83f-4e04-b197-38fe78afd01b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6556a33f-220d-477e-b2de-0e83c89d811f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6556a33f-220d-477e-b2de-0e83c89d811f
Content-Type: application/json

--- request body ---
{"handle":"qa-ce8f3fce2dc7","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6556a33f-220d-477e-b2de-0e83c89d811f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6556a33f-220d-477e-b2de-0e83c89d811f"}
```
