# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-5883c519-9c48-4935-a681-4b3276cf70ac` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-1cd852c9-24e5-4c53-82fd-d0086e1740be` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-fc7755f8-2fb4-4ddf-ab5e-4693c9a2ceed` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-38504181-fcc6-41e5-a2bd-018b1b3414ea` |
| 5 | `POST /v1/conversations` | 415 | 15 | `qa-673de6a5-6942-4d25-b27e-a00b72b49d8f` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-ce09d1e5-9350-4f8f-a7a2-75b35540bbfa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-42a53636-e7c1-4f96-8d34-922cdce024d1` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-94bf58a6-e877-49ab-a4d9-1356e3fbeff5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-fb639832-7059-4056-8ec7-76cd118af12b` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-b2c959fe-87c9-4363-8548-be73fc6a836e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5883c519-9c48-4935-a681-4b3276cf70ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5883c519-9c48-4935-a681-4b3276cf70ac
Content-Type: application/json

--- request body ---
{"handle":"qa-cc17317d1e96","displayName":"QA cc17317d1e96","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5883c519-9c48-4935-a681-4b3276cf70ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-cc17317d1e96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_149a1820-b48f-4c06-9fe6-01ae29d64da3","handle":"qa-cc17317d1e96","displayName":"QA cc17317d1e96","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.925506679Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1cd852c9-24e5-4c53-82fd-d0086e1740be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cd852c9-24e5-4c53-82fd-d0086e1740be
Content-Type: application/json

--- request body ---
{"handle":"qa-ce324ef996f1","displayName":"QA ce324ef996f1","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cd852c9-24e5-4c53-82fd-d0086e1740be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Location: /v1/accounts/qa-ce324ef996f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a1517e40-453c-4b3f-8187-4c78c213197c","handle":"qa-ce324ef996f1","displayName":"QA ce324ef996f1","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.990505222Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fc7755f8-2fb4-4ddf-ab5e-4693c9a2ceed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc7755f8-2fb4-4ddf-ab5e-4693c9a2ceed
Content-Type: application/json

--- request body ---
{"handle":"qa-cc17317d1e96","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc7755f8-2fb4-4ddf-ab5e-4693c9a2ceed
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_149a1820-b48f-4c06-9fe6-01ae29d64da3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-38504181-fcc6-41e5-a2bd-018b1b3414ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38504181-fcc6-41e5-a2bd-018b1b3414ea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ce324ef996f1","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-38504181-fcc6-41e5-a2bd-018b1b3414ea
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
Location: /v1/conversations/cnv_42ffa112-54f6-46c5-8bdc-8a18d53fe482
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_42ffa112-54f6-46c5-8bdc-8a18d53fe482","subject":"Error contract","status":"open","region":"eu","participants":["qa-cc17317d1e96","qa-ce324ef996f1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.055142568Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-673de6a5-6942-4d25-b27e-a00b72b49d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-673de6a5-6942-4d25-b27e-a00b72b49d8f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-673de6a5-6942-4d25-b27e-a00b72b49d8f
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-673de6a5-6942-4d25-b27e-a00b72b49d8f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ce09d1e5-9350-4f8f-a7a2-75b35540bbfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce09d1e5-9350-4f8f-a7a2-75b35540bbfa
Content-Type: application/json

--- request body ---
{"handle":"qa-ce324ef996f1","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce09d1e5-9350-4f8f-a7a2-75b35540bbfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a1517e40-453c-4b3f-8187-4c78c213197c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42a53636-e7c1-4f96-8d34-922cdce024d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42a53636-e7c1-4f96-8d34-922cdce024d1
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42a53636-e7c1-4f96-8d34-922cdce024d1
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
correlation: qa-94bf58a6-e877-49ab-a4d9-1356e3fbeff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94bf58a6-e877-49ab-a4d9-1356e3fbeff5
Content-Type: application/json

--- request body ---
{"handle":"qa-ce324ef996f1","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94bf58a6-e877-49ab-a4d9-1356e3fbeff5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94bf58a6-e877-49ab-a4d9-1356e3fbeff5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb639832-7059-4056-8ec7-76cd118af12b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb639832-7059-4056-8ec7-76cd118af12b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb639832-7059-4056-8ec7-76cd118af12b
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
correlation: qa-b2c959fe-87c9-4363-8548-be73fc6a836e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2c959fe-87c9-4363-8548-be73fc6a836e
Content-Type: application/json

--- request body ---
{"handle":"qa-cc17317d1e96","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2c959fe-87c9-4363-8548-be73fc6a836e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2c959fe-87c9-4363-8548-be73fc6a836e"}
```
