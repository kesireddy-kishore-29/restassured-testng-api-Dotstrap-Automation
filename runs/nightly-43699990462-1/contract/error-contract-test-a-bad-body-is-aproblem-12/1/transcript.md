# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-99c73c97-d5e8-42bc-8fcc-aa83095b18ae` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-886f1d13-f5c6-4ec7-b77c-dce5c25efbae` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-e34f5908-5396-49d2-aa22-2ff38ddbcdbb` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-599ffd13-c9a0-4555-a673-ab9789eb993c` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 45 | `qa-f38e4a35-d280-4e6d-b6a4-439571655ee8` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-4fcd3b26-8578-4ba2-aa63-da9718a1687d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f6621b58-e0ad-44e9-ba55-1938beee578e` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-453de112-9ac4-4743-88e6-616acbcd18c3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-646a2078-5411-4acf-a03f-ccfa0849a88c` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-8a5d51d1-97e2-407e-a16b-5bca2c589721` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99c73c97-d5e8-42bc-8fcc-aa83095b18ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99c73c97-d5e8-42bc-8fcc-aa83095b18ae
Content-Type: application/json

--- request body ---
{"handle":"qa-1bec25093a4e","displayName":"QA 1bec25093a4e","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-99c73c97-d5e8-42bc-8fcc-aa83095b18ae
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
Location: /v1/accounts/qa-1bec25093a4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bec00a0e-6e0e-4f03-891e-518da96a766f","handle":"qa-1bec25093a4e","displayName":"QA 1bec25093a4e","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.236470225Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-886f1d13-f5c6-4ec7-b77c-dce5c25efbae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-886f1d13-f5c6-4ec7-b77c-dce5c25efbae
Content-Type: application/json

--- request body ---
{"handle":"qa-a4ed67a46b2e","displayName":"QA a4ed67a46b2e","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-886f1d13-f5c6-4ec7-b77c-dce5c25efbae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Location: /v1/accounts/qa-a4ed67a46b2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc0527be-5b68-4ebc-a5d1-80c40e4297b6","handle":"qa-a4ed67a46b2e","displayName":"QA a4ed67a46b2e","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.269706112Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e34f5908-5396-49d2-aa22-2ff38ddbcdbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e34f5908-5396-49d2-aa22-2ff38ddbcdbb
Content-Type: application/json

--- request body ---
{"handle":"qa-1bec25093a4e","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e34f5908-5396-49d2-aa22-2ff38ddbcdbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bec00a0e-6e0e-4f03-891e-518da96a766f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-599ffd13-c9a0-4555-a673-ab9789eb993c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-599ffd13-c9a0-4555-a673-ab9789eb993c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a4ed67a46b2e","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-599ffd13-c9a0-4555-a673-ab9789eb993c
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
Location: /v1/conversations/cnv_bfdcfb29-e978-43a2-971d-779ab074e872
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bfdcfb29-e978-43a2-971d-779ab074e872","subject":"Error contract","status":"open","region":"eu","participants":["qa-1bec25093a4e","qa-a4ed67a46b2e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.340369021Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_bfdcfb29-e978-43a2-971d-779ab074e872/messages
correlation: qa-f38e4a35-d280-4e6d-b6a4-439571655ee8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f38e4a35-d280-4e6d-b6a4-439571655ee8
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 45 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f38e4a35-d280-4e6d-b6a4-439571655ee8
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_bfdcfb29-e978-43a2-971d-779ab074e872/messages","correlationId":"qa-f38e4a35-d280-4e6d-b6a4-439571655ee8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4fcd3b26-8578-4ba2-aa63-da9718a1687d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fcd3b26-8578-4ba2-aa63-da9718a1687d
Content-Type: application/json

--- request body ---
{"handle":"qa-a4ed67a46b2e","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fcd3b26-8578-4ba2-aa63-da9718a1687d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc0527be-5b68-4ebc-a5d1-80c40e4297b6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f6621b58-e0ad-44e9-ba55-1938beee578e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6621b58-e0ad-44e9-ba55-1938beee578e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f6621b58-e0ad-44e9-ba55-1938beee578e
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
correlation: qa-453de112-9ac4-4743-88e6-616acbcd18c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-453de112-9ac4-4743-88e6-616acbcd18c3
Content-Type: application/json

--- request body ---
{"handle":"qa-a4ed67a46b2e","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-453de112-9ac4-4743-88e6-616acbcd18c3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-453de112-9ac4-4743-88e6-616acbcd18c3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-646a2078-5411-4acf-a03f-ccfa0849a88c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-646a2078-5411-4acf-a03f-ccfa0849a88c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-646a2078-5411-4acf-a03f-ccfa0849a88c
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
correlation: qa-8a5d51d1-97e2-407e-a16b-5bca2c589721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a5d51d1-97e2-407e-a16b-5bca2c589721
Content-Type: application/json

--- request body ---
{"handle":"qa-1bec25093a4e","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a5d51d1-97e2-407e-a16b-5bca2c589721
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a5d51d1-97e2-407e-a16b-5bca2c589721"}
```
