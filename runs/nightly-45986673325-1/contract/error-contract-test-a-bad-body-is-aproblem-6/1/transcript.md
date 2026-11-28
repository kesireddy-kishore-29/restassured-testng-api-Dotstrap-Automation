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
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-9bcab10a-eb16-47ce-b28b-303d989abb33` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-31aaa209-6d21-4e4f-aa57-af06878946d5` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-391134fd-b50b-43ff-813a-96f223dbe845` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-d46b0762-040b-46ba-9953-9f419f1cbdc5` |
| 5 | `PATCH /v1/accounts/me` | 400 | 68 | `qa-b53b879d-756a-4903-b207-e6eeb26cd91e` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-5d8f7056-ec11-4e1e-a3da-f0a37b758b18` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a3a3f6a7-5a08-4e2e-aa9e-bbc323fd23ce` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-de1b9096-201d-4da7-9950-1a10270b201b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-a57d1440-2245-431d-9e10-1f3a99a41bf9` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-2484b1c6-7eb3-41ab-a44a-f5b0664f9025` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9bcab10a-eb16-47ce-b28b-303d989abb33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bcab10a-eb16-47ce-b28b-303d989abb33
Content-Type: application/json

--- request body ---
{"handle":"qa-67e99197e760","displayName":"QA 67e99197e760","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bcab10a-eb16-47ce-b28b-303d989abb33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-67e99197e760
X-Served-Region: eu
Content-Length: 181

{"id":"acc_35ffc294-6b7d-4e05-a174-16da79551526","handle":"qa-67e99197e760","displayName":"QA 67e99197e760","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.666847885Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-31aaa209-6d21-4e4f-aa57-af06878946d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31aaa209-6d21-4e4f-aa57-af06878946d5
Content-Type: application/json

--- request body ---
{"handle":"qa-6780a908c1c1","displayName":"QA 6780a908c1c1","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-31aaa209-6d21-4e4f-aa57-af06878946d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Location: /v1/accounts/qa-6780a908c1c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55aab83a-bc24-4d90-9cb8-ecb495ced428","handle":"qa-6780a908c1c1","displayName":"QA 6780a908c1c1","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.739051175Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-391134fd-b50b-43ff-813a-96f223dbe845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391134fd-b50b-43ff-813a-96f223dbe845
Content-Type: application/json

--- request body ---
{"handle":"qa-67e99197e760","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-391134fd-b50b-43ff-813a-96f223dbe845
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_35ffc294-6b7d-4e05-a174-16da79551526"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d46b0762-040b-46ba-9953-9f419f1cbdc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d46b0762-040b-46ba-9953-9f419f1cbdc5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6780a908c1c1","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d46b0762-040b-46ba-9953-9f419f1cbdc5
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
Location: /v1/conversations/cnv_e4dd3e6d-eb75-4742-883a-9a7c828aa05e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e4dd3e6d-eb75-4742-883a-9a7c828aa05e","subject":"Error contract","status":"open","region":"eu","participants":["qa-67e99197e760","qa-6780a908c1c1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.887194840Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b53b879d-756a-4903-b207-e6eeb26cd91e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53b879d-756a-4903-b207-e6eeb26cd91e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 68 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b53b879d-756a-4903-b207-e6eeb26cd91e
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-b53b879d-756a-4903-b207-e6eeb26cd91e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5d8f7056-ec11-4e1e-a3da-f0a37b758b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d8f7056-ec11-4e1e-a3da-f0a37b758b18
Content-Type: application/json

--- request body ---
{"handle":"qa-6780a908c1c1","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d8f7056-ec11-4e1e-a3da-f0a37b758b18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55aab83a-bc24-4d90-9cb8-ecb495ced428"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3a3f6a7-5a08-4e2e-aa9e-bbc323fd23ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3a3f6a7-5a08-4e2e-aa9e-bbc323fd23ce
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3a3f6a7-5a08-4e2e-aa9e-bbc323fd23ce
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
correlation: qa-de1b9096-201d-4da7-9950-1a10270b201b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de1b9096-201d-4da7-9950-1a10270b201b
Content-Type: application/json

--- request body ---
{"handle":"qa-6780a908c1c1","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de1b9096-201d-4da7-9950-1a10270b201b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de1b9096-201d-4da7-9950-1a10270b201b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a57d1440-2245-431d-9e10-1f3a99a41bf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a57d1440-2245-431d-9e10-1f3a99a41bf9
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a57d1440-2245-431d-9e10-1f3a99a41bf9
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
correlation: qa-2484b1c6-7eb3-41ab-a44a-f5b0664f9025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2484b1c6-7eb3-41ab-a44a-f5b0664f9025
Content-Type: application/json

--- request body ---
{"handle":"qa-67e99197e760","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2484b1c6-7eb3-41ab-a44a-f5b0664f9025
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2484b1c6-7eb3-41ab-a44a-f5b0664f9025"}
```
