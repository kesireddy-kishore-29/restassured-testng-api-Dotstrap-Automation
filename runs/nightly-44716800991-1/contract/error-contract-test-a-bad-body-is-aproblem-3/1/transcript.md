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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-a49d8490-1895-49da-a41a-a44ae69beadb` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-893c467a-3483-4980-ac8f-92862c131e36` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-a2c615d6-9a2d-444b-9aad-97e17bd7965a` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-beb1b196-9a9c-4b0e-b4a6-8b974b86b3c0` |
| 5 | `POST /v1/accounts` | 400 | 37 | `qa-c52d6db6-6435-4266-9ac7-6e67682e825c` |
| 6 | `POST /v1/auth/token` | 200 | 72 | `qa-24a1c9ab-eaeb-4ee7-9573-28ec8f0ddf67` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-e336eaad-ce9a-476b-b229-902d28c1e710` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-fde98d5d-82e7-4dd1-b68f-7904438f15ea` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ce8c57dc-13fd-4c84-8722-4b3fae14b0b6` |
| 10 | `POST /v1/auth/token` | 401 | 82 | `qa-734d8c47-9074-4da8-80b6-f47df2f52cc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a49d8490-1895-49da-a41a-a44ae69beadb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a49d8490-1895-49da-a41a-a44ae69beadb
Content-Type: application/json

--- request body ---
{"handle":"qa-2f423c0a7073","displayName":"QA 2f423c0a7073","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a49d8490-1895-49da-a41a-a44ae69beadb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-2f423c0a7073
X-Served-Region: eu
Content-Length: 181

{"id":"acc_367fffed-73c0-4bb5-a877-14795c9b3214","handle":"qa-2f423c0a7073","displayName":"QA 2f423c0a7073","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.394228587Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-893c467a-3483-4980-ac8f-92862c131e36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-893c467a-3483-4980-ac8f-92862c131e36
Content-Type: application/json

--- request body ---
{"handle":"qa-32edc613ca77","displayName":"QA 32edc613ca77","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-893c467a-3483-4980-ac8f-92862c131e36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-32edc613ca77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2079526c-5755-4289-89c4-3b38b04efc56","handle":"qa-32edc613ca77","displayName":"QA 32edc613ca77","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.453535184Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a2c615d6-9a2d-444b-9aad-97e17bd7965a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2c615d6-9a2d-444b-9aad-97e17bd7965a
Content-Type: application/json

--- request body ---
{"handle":"qa-2f423c0a7073","password":"****"}

--- response: 200 in 56 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2c615d6-9a2d-444b-9aad-97e17bd7965a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_367fffed-73c0-4bb5-a877-14795c9b3214"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-beb1b196-9a9c-4b0e-b4a6-8b974b86b3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beb1b196-9a9c-4b0e-b4a6-8b974b86b3c0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-32edc613ca77","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-beb1b196-9a9c-4b0e-b4a6-8b974b86b3c0
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
Location: /v1/conversations/cnv_e6d847a5-5af3-46e2-8adc-412ab46aabe0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e6d847a5-5af3-46e2-8adc-412ab46aabe0","subject":"Error contract","status":"open","region":"eu","participants":["qa-2f423c0a7073","qa-32edc613ca77"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.589476602Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c52d6db6-6435-4266-9ac7-6e67682e825c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c52d6db6-6435-4266-9ac7-6e67682e825c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c52d6db6-6435-4266-9ac7-6e67682e825c
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-c52d6db6-6435-4266-9ac7-6e67682e825c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-24a1c9ab-eaeb-4ee7-9573-28ec8f0ddf67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24a1c9ab-eaeb-4ee7-9573-28ec8f0ddf67
Content-Type: application/json

--- request body ---
{"handle":"qa-32edc613ca77","password":"****"}

--- response: 200 in 72 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-24a1c9ab-eaeb-4ee7-9573-28ec8f0ddf67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2079526c-5755-4289-89c4-3b38b04efc56"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e336eaad-ce9a-476b-b229-902d28c1e710

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e336eaad-ce9a-476b-b229-902d28c1e710
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e336eaad-ce9a-476b-b229-902d28c1e710
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
correlation: qa-fde98d5d-82e7-4dd1-b68f-7904438f15ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fde98d5d-82e7-4dd1-b68f-7904438f15ea
Content-Type: application/json

--- request body ---
{"handle":"qa-32edc613ca77","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fde98d5d-82e7-4dd1-b68f-7904438f15ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fde98d5d-82e7-4dd1-b68f-7904438f15ea"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce8c57dc-13fd-4c84-8722-4b3fae14b0b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8c57dc-13fd-4c84-8722-4b3fae14b0b6
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce8c57dc-13fd-4c84-8722-4b3fae14b0b6
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
correlation: qa-734d8c47-9074-4da8-80b6-f47df2f52cc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-734d8c47-9074-4da8-80b6-f47df2f52cc4
Content-Type: application/json

--- request body ---
{"handle":"qa-2f423c0a7073","password":"****"}

--- response: 401 in 82 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-734d8c47-9074-4da8-80b6-f47df2f52cc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-734d8c47-9074-4da8-80b6-f47df2f52cc4"}
```
